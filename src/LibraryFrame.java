import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryFrame extends JFrame {

    public LibraryFrame() {
        // Main Frame Configuration
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(41, 128, 185));
        JLabel titleLabel = new JLabel("Library Management System Dashboard");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(titleLabel);

        // Center Panel with Navigation Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 15, 15));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JButton btnBookManager = new JButton("Book Management");
        JButton btnMemberManager = new JButton("Member Management");
        JButton btnIssueReturn = new JButton("Issue / Return Books");
        JButton btnReports = new JButton("Reports & Logs");

        // Styling Buttons
        btnBookManager.setFont(new Font("Arial", Font.PLAIN, 14));
        btnMemberManager.setFont(new Font("Arial", Font.PLAIN, 14));
        btnIssueReturn.setFont(new Font("Arial", Font.PLAIN, 14));
        btnReports.setFont(new Font("Arial", Font.PLAIN, 14));

        // Adding Buttons to Panel
        buttonPanel.add(btnBookManager);
        buttonPanel.add(btnMemberManager);
        buttonPanel.add(btnIssueReturn);
        buttonPanel.add(btnReports);

        // Button Click Event Listeners
        btnBookManager.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Book Management Opened"));
            
        btnMemberManager.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Member Management Opened"));

        btnIssueReturn.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Issue/Return Module Opened"));

        btnReports.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Reports View Opened"));

        // Adding Components to Frame
        add(headerPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
}
