import javax.swing.*; //Swings Package
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGui extends JFrame {
    BookInfo[] bookInfo;
    LibraryGui(BookInfo[] bookInfo) {
        this.bookInfo = bookInfo;
        setTitle("CVR Library Management System");
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));  // 3 rows, 2 columns with gaps
        JLabel rollLabel = new JLabel("Enter your Roll No:");

        JTextField inputField = new JTextField(10);
        JButton getDetails = new JButton("Get Details");
        JLabel detailsLabel = new JLabel("Student Details:");
        JTextArea detailsArea = new JTextArea(10, 20);
        detailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(detailsArea);
        formPanel.add(rollLabel);
        formPanel.add(new JLabel(""));
        formPanel.add(inputField);
        formPanel.add(new JLabel(""));
        formPanel.add(getDetails);
        formPanel.add(new JLabel(""));
        formPanel.add(detailsLabel);
        formPanel.add(new JLabel(""));
        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        getDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roll = inputField.getText();
                String output;
                detailsArea.setBackground(Color.pink);
                if(roll!=null)
                {
                     output = findDetails(roll);
                     detailsArea.setText(output);
                }
                else
                    detailsArea.setText("Please Enter Id");
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        rollLabel.setBackground(Color.CYAN);
    }

    public String findDetails(String roll) {
        for (BookInfo book : bookInfo) {
            if (book.getRollNumber().equals(roll)) {
                return book.toString();
            }
        }
        return "No Book found on your Roll No";
    }
}
