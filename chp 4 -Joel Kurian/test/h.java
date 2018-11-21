import java . awt .  ;
import java . awt . event .  ;
publ ic c l a s s GreeterGUI2 extends JFrame
implements Ac t ionLi s t ene r
{ pr ivate JTextArea di splay ;
pr ivate JTe x tFi e ld inFi e ld ;
pr ivate Greeter gr e e t e r ;
publ ic GreeterGUI2 ( S t r ing t i t l e )
{ gr e e t e r = new Greeter ( ) ;
buildGUI ( ) ;
s e t T i t l e ( t i t l e ) ;
pack ( ) ;
s e tVi s i b l e ( t rue ) ;
} // G r e e t e r G U I 2 ( )
pr ivate void buildGUI ( )
{ Container contentPane = getContentPane ( ) ;
contentPane . setLayout (new BorderLayout ( ) ) ;
di splay = new JTextArea ( 1 0 , 3 0 ) ;
inFi e ld = new JTe x tFi e ld ( 1 0 ) ;
inFi e ld . addAct ionLi s tener ( thi s ) ;
JPanel inputPanel = new JPanel ( ) ;
inputPanel . add (new
JLabel ( ” Input your name and type ent e r : ” ) ) ;
inputPanel . add ( inFi e ld ) ;
contentPane . add ( ”Center ” , di splay ) ;
contentPane . add ( ”South” , inputPanel ) ;
} // b u i l d G U I ( )
publ ic void act ionPer formed ( Act ionEvent e )
{ i f ( e . getSource ( ) == inFi e ld )
{ S t r ing name = inFi e ld . getText ( ) ;
di splay . append ( gr e e t e r . gr e e t (name ) + ”\n” ) ;
}
} // a c t i o n P e r f o r m e d ( )