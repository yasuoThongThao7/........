import javax.swing.*;
import java.awt.*;

public class JPanelHome extends JPanelMini {
    private JLabel text = new JLabel("Trang chủ");
    private JLabel image = new JLabel();

    public JPanelHome() {
        //image
        image.setIcon(new ImageIcon("C:\\Users\\admin\\IdeaProjects\\moder\\icons\\nhane.png"));
        image.setBounds(20,2,48,48);
        add(image);
        //text
        text.setFont(new Font("Tahoma", Font.BOLD, 15));
        text.setBounds(130, 10, 100, 30);
        add(text);
        // Thiết lập JPanelHome
        setBounds(0, 250, 280, 60);
        setLayout(null);
        setBackground(new Color(25, 188, 211));

    }
}
class JPanelHomeMenu extends JPanel {
    private JPanel search;
    public JPanelHomeMenu() {
        //thanh tìm kiếm
        search = new JPanel();
        search.setLayout(null);
        search.setBackground(new Color(255, 255, 255));
        search.setBounds(0,0,920,50);


        //
        add(search);
        setLayout(null);
        setBackground(new Color(239, 239, 239));
        setBounds(280, 0, 920, 680);
    }
}
