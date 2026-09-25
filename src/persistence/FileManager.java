package persistence;

import model.Member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager {
    private static final String DATA_FOLDER = "data";
    private static final String MEMBER_FILE =
            DATA_FOLDER + File.separator + "members.dat";

    public FileManager() {
        File folder = new File(DATA_FOLDER);
        if (!folder.exists()) folder.mkdirs();
    }

    public void saveMembers(ArrayList<Member> members) {
        try (ObjectOutputStream output =
                     new ObjectOutputStream(new FileOutputStream(MEMBER_FILE))) {
            output.writeObject(members);
            System.out.println("Members saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving members: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Member> loadMembers() {
        File file = new File(MEMBER_FILE);
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream input =
                     new ObjectInputStream(new FileInputStream(MEMBER_FILE))) {
            return (ArrayList<Member>) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading members: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
