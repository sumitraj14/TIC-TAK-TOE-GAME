import java.awt.*;
import java.awt.event.*;
class tik_tak_toe extends Frame implements ActionListener{
	Button[] b= new Button[9];
	tik_tak_toe() {
		setLayout(null);
		int k=0;
		int x=100;
		int y=100;
		for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			b[k]=new Button("");
			b[k].setSize(50,50);
			b[k].setLocation(x,y);
			add(b[k]);
			b[k].addActionListener(this);
			k++;
			x=x+50;
		}
		x=100;
		y=y+50;
	}	
	}
	int c=0;
	public void actionPerformed(ActionEvent e) {
	
		Button b1=(Button) e.getSource();
		if(c%2==0) {
			b1.setLabel("x");
		}else {
			b1.setLabel("0");
		}
		b1.removeActionListener(this);
		c++;
		 if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")
			 || (b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")
			 || (b[3].getLabel()=="x" && b[4].getLabel()=="x" && b[5].getLabel()=="x")
			 || (b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")
			 || (b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")
			 || (b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")
			 || (b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")
			 || (b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")
			 || (b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x")){
			 System.out.println("player 1 is winner");
			  
		 }
		 else if 
			 (  (b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")
			 || (b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
			 || (b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
			 || (b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
			 || (b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
			 || (b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
			 || (b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
			 || (b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0")){
			 System.out.println("player 2 is winner");
		 }
	
}
	}
public   class Tic_tak_toe_game {

	public static void main(String[] args)  {
		tik_tak_toe t= new tik_tak_toe();
		t.setVisible(true);
		t.setSize(400,400);
		t.setLocation(100,100);
		t.setBackground(Color.cyan);
		Font f= new Font("Forte",Font.ITALIC,20);
		t.setFont(f);
		t.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
		);
	}

}