package Student_Grade_Tracker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StudController  implements ActionListener{
    
	StudView fr;
    Student s1;
    StudModel dm;
	
	public StudController(StudView  fr) {
		this.fr = fr;
		s1=new Student();
		dm=new StudModel();

	}
		
		@Override
		public void actionPerformed(ActionEvent  evt) {
			Object obj =evt.getSource();
			if(obj==fr.b1) {
				s1.setRollno(Integer.parseInt(fr.t1.getText()));
			    s1.setName(fr.t2.getText());
			    s1.setMarks(Integer.parseInt(fr.t3.getText()));
			    dm.addrecord(s1);
			
		}else if(obj==fr.b2) {
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
		    s1.setName(fr.t2.getText());
		    s1.setMarks(Integer.parseInt(fr.t3.getText()));
		    dm.updaterecord(s1);
		    
		}else if(obj== fr.b3) {
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			dm.Deleterecord(s1);
		}else if(obj==fr.b5){
			fr.t1.setText(" ");
			fr.t2.setText(" ");
			fr.t3.setText(" ");
			
		}else if(obj==fr.b4) {
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			s1=dm.Searchrecord(s1);
			fr.t2.setText(s1.getName());
			fr.t3.setText(" "+s1.getMarks());
		}
		
}
}
    
    
    

