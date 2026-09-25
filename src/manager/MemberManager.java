package manager;

import model.Member;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class MemberManager {
    private ArrayList<Member> members;

    public MemberManager() {
        members = new ArrayList<>();
    }

    public MemberManager(ArrayList<Member> members) {
        this.members = members == null ? new ArrayList<>() : members;
    }

    public void addMember(Member member) {
        if (member == null) throw new IllegalArgumentException("Member cannot be null.");
        validateMember(member);
        if (getMemberById(member.getMemberId()) != null)
            throw new IllegalArgumentException("Member ID already exists.");
        members.add(member);
    }

    public ArrayList<Member> getAllMembers() {
        return new ArrayList<>(members);
    }

    public Member getMemberById(String memberId) {
        if (memberId == null || memberId.trim().isEmpty()) return null;
        for (Member member : members) {
            if (member.getMemberId() != null &&
                    member.getMemberId().equalsIgnoreCase(memberId.trim())) {
                return member;
            }
        }
        return null;
    }

    public ArrayList<Member> searchMembers(String keyword) {
        ArrayList<Member> results = new ArrayList<>();
        if (keyword == null || keyword.trim().isEmpty()) return results;
        String search = keyword.trim().toLowerCase();
        for (Member member : members) {
            if (member.getMemberId().toLowerCase().contains(search)
                    || member.getName().toLowerCase().contains(search)
                    || member.getDepartment().toLowerCase().contains(search)
                    || member.getPhone().contains(search)
                    || member.getEmail().toLowerCase().contains(search)) {
                results.add(member);
            }
        }
        return results;
    }

    public void updateMember(Member updatedMember) {
        if (updatedMember == null) throw new IllegalArgumentException("Member cannot be null.");
        validateMember(updatedMember);
        Member existingMember = getMemberById(updatedMember.getMemberId());
        if (existingMember == null) throw new IllegalArgumentException("Member not found.");
        existingMember.setName(updatedMember.getName());
        existingMember.setDepartment(updatedMember.getDepartment());
        existingMember.setPhone(updatedMember.getPhone());
        existingMember.setEmail(updatedMember.getEmail());
    }

    public void deleteMember(String memberId) {
        if (memberId == null || memberId.trim().isEmpty())
            throw new IllegalArgumentException("Member ID cannot be empty.");
        Member member = getMemberById(memberId);
        if (member == null) throw new IllegalArgumentException("Member not found.");
        members.remove(member);
    }

    private void validateMember(Member member) {
        if (member.getMemberId() == null || member.getMemberId().trim().isEmpty())
            throw new IllegalArgumentException("Member ID cannot be empty.");
        if (member.getName() == null || member.getName().trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        if (member.getDepartment() == null || member.getDepartment().trim().isEmpty())
            throw new IllegalArgumentException("Department cannot be empty.");
        if (member.getPhone() == null || member.getPhone().trim().isEmpty()
                || !member.getPhone().matches("\\+?[0-9]{10,15}"))
            throw new IllegalArgumentException("Invalid phone number.");
        if (member.getEmail() == null || member.getEmail().trim().isEmpty()
                || !Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", member.getEmail()))
            throw new IllegalArgumentException("Invalid email address.");
    }

    public boolean memberExists(String memberId) {
        return getMemberById(memberId) != null;
    }

    public int getMemberCount() {
        return members.size();
    }
}
