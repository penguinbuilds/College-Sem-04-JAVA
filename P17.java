// Applet and Events
import java.awt.*;
import java.awt.event.*;

public class P17 extends Frame implements ActionListener {

   private Label label;
   private Button button;

   public P17() {
      setLayout(new FlowLayout());
      label = new Label(":/");
      add(label);
      button = new Button("Click me");
      add(button);
      button.addActionListener(this);
      setTitle("Java Program 17");
      setSize(300, 100);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      label.setText(":-)");
   }

   public static void main(String[] args) {
      new P17();
   }
}
