import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
//R J HARI
public class guess{
    static int max=5,a,b;
    public static void main(String[] args){
        JFrame guessit=new JFrame();
        guessit.setTitle("Number Guessing Game");
        guessit.getContentPane().setBackground(Color.YELLOW);
        guessit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guessit.setSize(500,500);
        guessit.setResizable(false);
        Random rand=new Random();
        Label head=new Label("NUMBER GUESSING GAME");
        head.setFont(new Font("Algerian",Font.BOLD,25));
        head.setBounds(40,50,350,50);
        guessit.add(head);

        Label label=new Label();
        label.setText("Enter the number that you guess :");
        label.setFont(new Font("Times New Roman",Font.BOLD,15));
        label.setBounds(40,100,350,50);
        guessit.add(label);

        TextField num=new TextField();
        num.setBounds(100, 150, 150,30);
        guessit.add(num);

        Button sub=new Button("Submit");
        sub.setFont(new Font("Times New Roman",Font.BOLD,15));
        sub.setBounds(100,200,150,30);
        guessit.add(sub);
        
        Label answer=new Label(" ");
        answer.setFont(new Font("Times New Roman",Font.BOLD,15));
        answer.setBounds(40,250,1000,30);
        guessit.add(answer);

        Label ans2=new Label(" ");
        ans2.setFont(new Font("Times New Roman",Font.BOLD,15));
        ans2.setBounds(40,300,1000,30);
        guessit.add(ans2);

        Label ans3=new Label(" ");
        ans3.setFont(new Font("Times New Roman",Font.BOLD,15));
        ans3.setBounds(40,350,1000,30);
        guessit.add(ans3);

        Label l=new Label(" ");
        guessit.add(l);
        guessit.setVisible(true);
        a=rand.nextInt(1,100);
        sub.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e){
            if(max<=0){
                answer.setText("Sorry you couldn't guess the correct number");
                ans2.setText("Your point is 0");
                ans3.setText("The correct number was "+a);
            }
            else{
            b=Integer.parseInt(num.getText());
            if(b==a){
                    answer.setText("Your guess is correct");
                    ans2.setText("Your point is "+max);
                    ans3.setText(" ");
                    max-=1;
            }
            else if(b<a){
                answer.setText("Please guess higher value");
                ans2.setText(" ");
                ans3.setText(" ");
                max-=1;
            }
            else{
                    answer.setText("Please guess a lower value");
                    ans2.setText(" ");
                    ans3.setText(" ");
                    max-=1;
                }
            if(max==0){
                answer.setText("Sorry you couldn't guess the correct number");
                ans2.setText("Your point is 0");
                ans3.setText("The correct number was "+a);
            }
        }
        }
        }); 
     } 
}
