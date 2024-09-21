import javax.swing.*;
import java.awt.*;

public class JPanelSupplier extends JPanelMini{
    private JLabel text = new JLabel("Nhà cung cấp");
    private JLabel image = new JLabel();

    public JPanelSupplier () {
        image.setIcon(new ImageIcon("C:\\Users\\admin\\IdeaProjects\\moder\\icons\\nhacungcap.png"));
        image.setBounds(20,2,48,48);
        add(image);
        //text
        text.setFont(new Font("Tahoma", Font.BOLD, 15));
        text.setBounds(130, 10, 130, 30);
        add(text);
        // Thiết lập JPanelHome
        setBounds(0, 490, 280, 60);
        setLayout(null);
        setBackground(new Color(25, 188, 211));
    }
}
class JPanelSupplierMenu extends JPanel {
    public JPanelSupplierMenu() {

        setLayout(null);
        setBackground(new Color(202, 193, 193));
        setBounds(280, 0, 920, 680);
    }
}
