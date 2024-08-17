package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class My_Labels {
    public JLabel logoLabelFun() {
        /* Logo label implementation */

        ImageIcon logoIcon = new ImageIcon("E://Swing Project//assets//Main_Logo_Resized.png");
        JLabel logoLabel = new JLabel();
        logoLabel.setText("Employee Manager");
        logoLabel.setIcon(logoIcon);
        logoLabel.setVerticalTextPosition(JLabel.BOTTOM);
        logoLabel.setHorizontalTextPosition(JLabel.CENTER);
        logoLabel.setIconTextGap(-50);
        logoLabel.setVerticalAlignment(JLabel.TOP);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        logoLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
        logoLabel.setForeground(Color.WHITE);
        return logoLabel;
    }

    public JLabel navigationLabelFun() {
        /* Navigation label implementation */

        JLabel navigationLabel = new JLabel();
        navigationLabel.setLayout(new GridLayout(4, 1, 10, 10));
        return navigationLabel;
    }

    public JLabel userFormLabelFun() {
        JLabel userFormLabel = new JLabel();
        userFormLabel.setLayout(null);

        /* Form Title */
        JLabel formTitle = new JLabel("Add New Employee");
        formTitle.setForeground(Color.WHITE);
        formTitle.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
        formTitle.setBounds(130, 80, 350, 30);
        userFormLabel.add(formTitle);

        /* User Name Label */
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        nameLabel.setBounds(100, 150, 100, 30);
        userFormLabel.add(nameLabel);

        /* User Name Text Field */
        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        nameField.setBounds(200, 150, 200, 30);
        userFormLabel.add(nameField);

        /* User ID Label */
        JLabel idLabel = new JLabel("User ID:");
        idLabel.setForeground(Color.WHITE);
        idLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        idLabel.setBounds(100, 200, 100, 30);
        userFormLabel.add(idLabel);

        /* User ID Text Field */
        JTextField idField = new JTextField();
        idField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        idField.setBounds(200, 200, 200, 30);
        userFormLabel.add(idField);

        /* User Designation */
        JLabel designationLabel = new JLabel("Postion:");
        designationLabel.setForeground(Color.WHITE);
        designationLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        designationLabel.setBounds(100, 250, 100, 30);
        userFormLabel.add(designationLabel);

        return userFormLabel;
    }
}
