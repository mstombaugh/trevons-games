/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgames.BattleShip;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Mike
 */
public class BattleShipGUI extends javax.swing.JFrame {
    
    private boolean p1Turn=true;
    private boolean placeShips=true;
    static int currentShip=0;
    
    ArrayList<ArrayList<JButton>> p1button;
    ArrayList<ArrayList<JButton>> p2button;
    
    
    
    
    public BattleShipGUI() {
        initComponents();
        p1button = new ArrayList<ArrayList<JButton>>();
        p2button = new ArrayList<ArrayList<JButton>>();
        
        for(int x=0;x<10;x++){
            p1button.add(new ArrayList<JButton>());
            p2button.add(new ArrayList<JButton>());
        }
        
        init();
    }
    
    //don't question this, just hope it works
    public void init(){
        p1button.get(9).add(jButton1);
        p1button.get(9).add(jButton2);
        p1button.get(9).add(jButton3);
        p1button.get(9).add(jButton4);
        p1button.get(9).add(jButton5);
        p1button.get(9).add(jButton6);
        p1button.get(9).add(jButton7);
        p1button.get(9).add(jButton8);
        p1button.get(9).add(jButton9);
        p1button.get(9).add(jButton10);
        
        p1button.get(8).add(jButton11);
        p1button.get(8).add(jButton12);
        p1button.get(8).add(jButton13);
        p1button.get(8).add(jButton14);
        p1button.get(8).add(jButton15);
        p1button.get(8).add(jButton16);
        p1button.get(8).add(jButton17);
        p1button.get(8).add(jButton18);
        p1button.get(8).add(jButton19);
        p1button.get(8).add(jButton20);
        
        p1button.get(7).add(jButton21);
        p1button.get(7).add(jButton22);
        p1button.get(7).add(jButton23);
        p1button.get(7).add(jButton24);
        p1button.get(7).add(jButton25);
        p1button.get(7).add(jButton26);
        p1button.get(7).add(jButton27);
        p1button.get(7).add(jButton28);
        p1button.get(7).add(jButton29);
        p1button.get(7).add(jButton30);
        
        p1button.get(6).add(jButton31);
        p1button.get(6).add(jButton32);
        p1button.get(6).add(jButton33);
        p1button.get(6).add(jButton34);
        p1button.get(6).add(jButton35);
        p1button.get(6).add(jButton36);
        p1button.get(6).add(jButton37);
        p1button.get(6).add(jButton38);
        p1button.get(6).add(jButton39);
        p1button.get(6).add(jButton40);
        
        p1button.get(5).add(jButton41);
        p1button.get(5).add(jButton42);
        p1button.get(5).add(jButton43);
        p1button.get(5).add(jButton44);
        p1button.get(5).add(jButton45);
        p1button.get(5).add(jButton46);
        p1button.get(5).add(jButton47);
        p1button.get(5).add(jButton48);
        p1button.get(5).add(jButton49);
        p1button.get(5).add(jButton50);
        
        p1button.get(4).add(jButton51);
        p1button.get(4).add(jButton52);
        p1button.get(4).add(jButton53);
        p1button.get(4).add(jButton54);
        p1button.get(4).add(jButton55);
        p1button.get(4).add(jButton56);
        p1button.get(4).add(jButton57);
        p1button.get(4).add(jButton58);
        p1button.get(4).add(jButton59);
        p1button.get(4).add(jButton60);
        
        p1button.get(3).add(jButton61);
        p1button.get(3).add(jButton62);
        p1button.get(3).add(jButton63);
        p1button.get(3).add(jButton64);
        p1button.get(3).add(jButton65);
        p1button.get(3).add(jButton66);
        p1button.get(3).add(jButton67);
        p1button.get(3).add(jButton68);
        p1button.get(3).add(jButton69);
        p1button.get(3).add(jButton70);
        
        p1button.get(2).add(jButton71);
        p1button.get(2).add(jButton72);
        p1button.get(2).add(jButton73);
        p1button.get(2).add(jButton74);
        p1button.get(2).add(jButton75);
        p1button.get(2).add(jButton76);
        p1button.get(2).add(jButton77);
        p1button.get(2).add(jButton78);
        p1button.get(2).add(jButton79);
        p1button.get(2).add(jButton80);
        
        p1button.get(1).add(jButton81);
        p1button.get(1).add(jButton82);
        p1button.get(1).add(jButton83);
        p1button.get(1).add(jButton84);
        p1button.get(1).add(jButton85);
        p1button.get(1).add(jButton86);
        p1button.get(1).add(jButton87);
        p1button.get(1).add(jButton88);
        p1button.get(1).add(jButton89);
        p1button.get(1).add(jButton90);
        
        p1button.get(0).add(jButton91);
        p1button.get(0).add(jButton92);
        p1button.get(0).add(jButton93);
        p1button.get(0).add(jButton94);
        p1button.get(0).add(jButton95);
        p1button.get(0).add(jButton96);
        p1button.get(0).add(jButton97);
        p1button.get(0).add(jButton98);
        p1button.get(0).add(jButton99);
        p1button.get(0).add(jButton100);
        
        p2button.get(9).add(jButton101);
        p2button.get(9).add(jButton102);
        p2button.get(9).add(jButton103);
        p2button.get(9).add(jButton104);
        p2button.get(9).add(jButton105);
        p2button.get(9).add(jButton106);
        p2button.get(9).add(jButton107);
        p2button.get(9).add(jButton108);
        p2button.get(9).add(jButton109);
        p2button.get(9).add(jButton110);
        
        p2button.get(8).add(jButton111);
        p2button.get(8).add(jButton112);
        p2button.get(8).add(jButton113);
        p2button.get(8).add(jButton114);
        p2button.get(8).add(jButton115);
        p2button.get(8).add(jButton116);
        p2button.get(8).add(jButton117);
        p2button.get(8).add(jButton118);
        p2button.get(8).add(jButton119);
        p2button.get(8).add(jButton120);
        
        p2button.get(7).add(jButton121);
        p2button.get(7).add(jButton122);
        p2button.get(7).add(jButton123);
        p2button.get(7).add(jButton124);
        p2button.get(7).add(jButton125);
        p2button.get(7).add(jButton126);
        p2button.get(7).add(jButton127);
        p2button.get(7).add(jButton128);
        p2button.get(7).add(jButton129);
        p2button.get(7).add(jButton130);
        
        p2button.get(6).add(jButton131);
        p2button.get(6).add(jButton132);
        p2button.get(6).add(jButton133);
        p2button.get(6).add(jButton134);
        p2button.get(6).add(jButton135);
        p2button.get(6).add(jButton136);
        p2button.get(6).add(jButton137);
        p2button.get(6).add(jButton138);
        p2button.get(6).add(jButton139);
        p2button.get(6).add(jButton140);
        
        p2button.get(5).add(jButton141);
        p2button.get(5).add(jButton142);
        p2button.get(5).add(jButton143);
        p2button.get(5).add(jButton144);
        p2button.get(5).add(jButton145);
        p2button.get(5).add(jButton146);
        p2button.get(5).add(jButton147);
        p2button.get(5).add(jButton148);
        p2button.get(5).add(jButton149);
        p2button.get(5).add(jButton150);
        
        p2button.get(4).add(jButton151);
        p2button.get(4).add(jButton152);
        p2button.get(4).add(jButton153);
        p2button.get(4).add(jButton154);
        p2button.get(4).add(jButton155);
        p2button.get(4).add(jButton156);
        p2button.get(4).add(jButton157);
        p2button.get(4).add(jButton158);
        p2button.get(4).add(jButton159);
        p2button.get(4).add(jButton160);
        
        p2button.get(3).add(jButton161);
        p2button.get(3).add(jButton162);
        p2button.get(3).add(jButton163);
        p2button.get(3).add(jButton164);
        p2button.get(3).add(jButton165);
        p2button.get(3).add(jButton166);
        p2button.get(3).add(jButton167);
        p2button.get(3).add(jButton168);
        p2button.get(3).add(jButton169);
        p2button.get(3).add(jButton170);
        
        p2button.get(2).add(jButton171);
        p2button.get(2).add(jButton172);
        p2button.get(2).add(jButton173);
        p2button.get(2).add(jButton174);
        p2button.get(2).add(jButton175);
        p2button.get(2).add(jButton176);
        p2button.get(2).add(jButton177);
        p2button.get(2).add(jButton178);
        p2button.get(2).add(jButton179);
        p2button.get(2).add(jButton180);
        
        p2button.get(1).add(jButton181);
        p2button.get(1).add(jButton182);
        p2button.get(1).add(jButton183);
        p2button.get(1).add(jButton184);
        p2button.get(1).add(jButton185);
        p2button.get(1).add(jButton186);
        p2button.get(1).add(jButton187);
        p2button.get(1).add(jButton188);
        p2button.get(1).add(jButton189);
        p2button.get(1).add(jButton190);
        
        p2button.get(0).add(jButton191);
        p2button.get(0).add(jButton192);
        p2button.get(0).add(jButton193);
        p2button.get(0).add(jButton194);
        p2button.get(0).add(jButton195);
        p2button.get(0).add(jButton196);
        p2button.get(0).add(jButton197);
        p2button.get(0).add(jButton198);
        p2button.get(0).add(jButton199);
        p2button.get(0).add(jButton200);
        
        
        
        
        
        
        
        
    }
    
    Ship.point getCoordsp1(JButton b){
        for(int y=0;y<10;y++){
            for(int x=0; x<10;x++){
                if(p1button.get(y).get(x).equals(b)){
                    return new Ship.point(x,y);
                }
            }
        }
        
        return new Ship.point(-1,-1);
    }
    
    Ship.point getCoordsp2(JButton b){
        for(int y=0;y<10;y++){
            for(int x=0; x<10;x++){
                if(p2button.get(y).get(x).equals(b)){
                    return new Ship.point(x,y);
                }
            }
        }
        
        return new Ship.point(-1,-1);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        p2Panel = new javax.swing.JPanel();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        jButton159 = new javax.swing.JButton();
        jButton160 = new javax.swing.JButton();
        jButton161 = new javax.swing.JButton();
        jButton162 = new javax.swing.JButton();
        jButton163 = new javax.swing.JButton();
        jButton164 = new javax.swing.JButton();
        jButton165 = new javax.swing.JButton();
        jButton166 = new javax.swing.JButton();
        jButton167 = new javax.swing.JButton();
        jButton168 = new javax.swing.JButton();
        jButton169 = new javax.swing.JButton();
        jButton170 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jButton174 = new javax.swing.JButton();
        jButton175 = new javax.swing.JButton();
        jButton176 = new javax.swing.JButton();
        jButton177 = new javax.swing.JButton();
        jButton178 = new javax.swing.JButton();
        jButton179 = new javax.swing.JButton();
        jButton180 = new javax.swing.JButton();
        jButton181 = new javax.swing.JButton();
        jButton182 = new javax.swing.JButton();
        jButton183 = new javax.swing.JButton();
        jButton184 = new javax.swing.JButton();
        jButton185 = new javax.swing.JButton();
        jButton186 = new javax.swing.JButton();
        jButton187 = new javax.swing.JButton();
        jButton188 = new javax.swing.JButton();
        jButton189 = new javax.swing.JButton();
        jButton190 = new javax.swing.JButton();
        jButton191 = new javax.swing.JButton();
        jButton192 = new javax.swing.JButton();
        jButton193 = new javax.swing.JButton();
        jButton194 = new javax.swing.JButton();
        jButton195 = new javax.swing.JButton();
        jButton196 = new javax.swing.JButton();
        jButton197 = new javax.swing.JButton();
        jButton198 = new javax.swing.JButton();
        jButton199 = new javax.swing.JButton();
        jButton200 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1Panel.setBackground(new java.awt.Color(51, 204, 255));
        p1Panel.setLayout(new java.awt.GridLayout(10, 10, 10, 10));

        jButton1.setText(" ");
        jButton1.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                p1ActionHandler(evt);
            }
        });
        p1Panel.add(jButton1);

        jButton2.setText(" ");
        jButton2.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton2);

        jButton3.setText(" ");
        jButton3.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton3);

        jButton4.setText(" ");
        jButton4.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton4);

        jButton5.setText(" ");
        jButton5.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton5);

        jButton6.setText(" ");
        jButton6.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton6);

        jButton7.setText(" ");
        jButton7.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton7);

        jButton8.setText(" ");
        jButton8.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton8);

        jButton9.setText(" ");
        jButton9.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton9);

        jButton10.setText(" ");
        jButton10.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton10);

        jButton11.setText(" ");
        jButton11.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton11);

        jButton12.setText(" ");
        jButton12.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton12);

        jButton13.setText(" ");
        jButton13.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton13);

        jButton14.setText(" ");
        jButton14.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton14);

        jButton15.setText(" ");
        jButton15.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton15);

        jButton16.setText(" ");
        jButton16.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton16);

        jButton17.setText(" ");
        jButton17.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton17);

        jButton18.setText(" ");
        jButton18.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton18);

        jButton19.setText(" ");
        jButton19.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton19);

        jButton20.setText(" ");
        jButton20.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton20);

        jButton21.setText(" ");
        jButton21.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton21);

        jButton22.setText(" ");
        jButton22.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton22);

        jButton23.setText(" ");
        jButton23.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton23);

        jButton24.setText(" ");
        jButton24.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton24);

        jButton25.setText(" ");
        jButton25.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton25);

        jButton26.setText(" ");
        jButton26.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton26);

        jButton27.setText(" ");
        jButton27.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton27);

        jButton28.setText(" ");
        jButton28.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton28);

        jButton29.setText(" ");
        jButton29.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton29);

        jButton30.setText(" ");
        jButton30.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton30);

        jButton31.setText(" ");
        jButton31.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton31);

        jButton32.setText(" ");
        jButton32.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton32);

        jButton33.setText(" ");
        jButton33.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton33);

        jButton34.setText(" ");
        jButton34.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton34);

        jButton35.setText(" ");
        jButton35.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton35);

        jButton36.setText(" ");
        jButton36.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton36);

        jButton37.setText(" ");
        jButton37.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton37);

        jButton38.setText(" ");
        jButton38.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton38);

        jButton39.setText(" ");
        jButton39.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton39);

        jButton40.setText(" ");
        jButton40.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton40);

        jButton41.setText(" ");
        jButton41.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton41);

        jButton42.setText(" ");
        jButton42.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton42);

        jButton43.setText(" ");
        jButton43.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton43);

        jButton44.setText(" ");
        jButton44.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton44);

        jButton45.setText(" ");
        jButton45.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton45);

        jButton46.setText(" ");
        jButton46.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton46);

        jButton47.setText(" ");
        jButton47.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton47);

        jButton48.setText(" ");
        jButton48.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton48);

        jButton49.setText(" ");
        jButton49.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton49);

        jButton50.setText(" ");
        jButton50.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton50);

        jButton51.setText(" ");
        jButton51.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton51);

        jButton52.setText(" ");
        jButton52.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton52);

        jButton53.setText(" ");
        jButton53.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton53);

        jButton54.setText(" ");
        jButton54.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton54);

        jButton55.setText(" ");
        jButton55.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton55);

        jButton56.setText(" ");
        jButton56.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton56);

        jButton57.setText(" ");
        jButton57.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton57);

        jButton58.setText(" ");
        jButton58.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton58);

        jButton59.setText(" ");
        jButton59.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton59);

        jButton60.setText(" ");
        jButton60.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton60);

        jButton61.setText(" ");
        jButton61.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton61);

        jButton62.setText(" ");
        jButton62.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton62);

        jButton63.setText(" ");
        jButton63.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton63);

        jButton64.setText(" ");
        jButton64.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton64);

        jButton65.setText(" ");
        jButton65.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton65);

        jButton66.setText(" ");
        jButton66.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton66);

        jButton67.setText(" ");
        jButton67.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton67);

        jButton68.setText(" ");
        jButton68.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton68);

        jButton69.setText(" ");
        jButton69.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton69);

        jButton70.setText(" ");
        jButton70.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton70);

        jButton71.setText(" ");
        jButton71.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton71);

        jButton72.setText(" ");
        jButton72.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton72);

        jButton73.setText(" ");
        jButton73.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton73);

        jButton74.setText(" ");
        jButton74.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton74);

        jButton75.setText(" ");
        jButton75.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton75);

        jButton76.setText(" ");
        jButton76.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton76);

        jButton77.setText(" ");
        jButton77.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton77);

        jButton78.setText(" ");
        jButton78.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton78);

        jButton79.setText(" ");
        jButton79.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton79);

        jButton80.setText(" ");
        jButton80.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton80);

        jButton81.setText(" ");
        jButton81.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton81);

        jButton82.setText(" ");
        jButton82.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton82);

        jButton83.setText(" ");
        jButton83.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton83);

        jButton84.setText(" ");
        jButton84.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton84);

        jButton85.setText(" ");
        jButton85.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton85);

        jButton86.setText(" ");
        jButton86.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton86);

        jButton87.setText(" ");
        jButton87.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton87);

        jButton88.setText(" ");
        jButton88.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton88);

        jButton89.setText(" ");
        jButton89.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton89);

        jButton90.setText(" ");
        jButton90.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton90);

        jButton91.setText(" ");
        jButton91.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton91);

        jButton92.setText(" ");
        jButton92.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton92);

        jButton93.setText(" ");
        jButton93.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton93);

        jButton94.setText(" ");
        jButton94.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton94);

        jButton95.setText(" ");
        jButton95.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton95);

        jButton96.setText(" ");
        jButton96.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton96);

        jButton97.setText(" ");
        jButton97.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton97);

        jButton98.setText(" ");
        jButton98.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton98);

        jButton99.setText(" ");
        jButton99.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton99);

        jButton100.setText(" ");
        jButton100.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        p1Panel.add(jButton100);

        p2Panel.setBackground(new java.awt.Color(51, 204, 255));
        p2Panel.setLayout(new java.awt.GridLayout(10, 10, 10, 10));

        jButton101.setText(" ");
        jButton101.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionHandler(evt);
            }
        });
        p2Panel.add(jButton101);

        jButton102.setText(" ");
        jButton102.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton102);

        jButton103.setText(" ");
        jButton103.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton103);

        jButton104.setText(" ");
        jButton104.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton104);

        jButton105.setText(" ");
        jButton105.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton105);

        jButton106.setText(" ");
        jButton106.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton106);

        jButton107.setText(" ");
        jButton107.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton107);

        jButton108.setText(" ");
        jButton108.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton108);

        jButton109.setText(" ");
        jButton109.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton109);

        jButton110.setText(" ");
        jButton110.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton110);

        jButton111.setText(" ");
        jButton111.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton111);

        jButton112.setText(" ");
        jButton112.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton112);

        jButton113.setText(" ");
        jButton113.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton113);

        jButton114.setText(" ");
        jButton114.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton114);

        jButton115.setText(" ");
        jButton115.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton115);

        jButton116.setText(" ");
        jButton116.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton116);

        jButton117.setText(" ");
        jButton117.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton117);

        jButton118.setText(" ");
        jButton118.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton118);

        jButton119.setText(" ");
        jButton119.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton119);

        jButton121.setText(" ");
        jButton121.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton121);

        jButton120.setText(" ");
        jButton120.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton120);

        jButton122.setText(" ");
        jButton122.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton122);

        jButton123.setText(" ");
        jButton123.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton123);

        jButton124.setText(" ");
        jButton124.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton124);

        jButton125.setText(" ");
        jButton125.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton125);

        jButton126.setText(" ");
        jButton126.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton126);

        jButton127.setText(" ");
        jButton127.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton127);

        jButton128.setText(" ");
        jButton128.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton128);

        jButton129.setText(" ");
        jButton129.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton129);

        jButton131.setText(" ");
        jButton131.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton131);

        jButton130.setText(" ");
        jButton130.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton130);

        jButton132.setText(" ");
        jButton132.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton132);

        jButton133.setText(" ");
        jButton133.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton133);

        jButton134.setText(" ");
        jButton134.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton134);

        jButton135.setText(" ");
        jButton135.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton135);

        jButton136.setText(" ");
        jButton136.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton136);

        jButton137.setText(" ");
        jButton137.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton137);

        jButton138.setText(" ");
        jButton138.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton138);

        jButton141.setText(" ");
        jButton141.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton141);

        jButton140.setText(" ");
        jButton140.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton140);

        jButton139.setText(" ");
        jButton139.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton139);

        jButton142.setText(" ");
        jButton142.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton142);

        jButton143.setText(" ");
        jButton143.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton143);

        jButton144.setText(" ");
        jButton144.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton144);

        jButton145.setText(" ");
        jButton145.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton145);

        jButton146.setText(" ");
        jButton146.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton146);

        jButton147.setText(" ");
        jButton147.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton147);

        jButton148.setText(" ");
        jButton148.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton148);

        jButton151.setText(" ");
        jButton151.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton151);

        jButton150.setText(" ");
        jButton150.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton150);

        jButton149.setText(" ");
        jButton149.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton149);

        jButton152.setText(" ");
        jButton152.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton152);

        jButton153.setText(" ");
        jButton153.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton153);

        jButton154.setText(" ");
        jButton154.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton154);

        jButton155.setText(" ");
        jButton155.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton155);

        jButton156.setText(" ");
        jButton156.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton156);

        jButton157.setText(" ");
        jButton157.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton157);

        jButton158.setText(" ");
        jButton158.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton158);

        jButton159.setText(" ");
        jButton159.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton159);

        jButton160.setText(" ");
        jButton160.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton160);

        jButton161.setText(" ");
        jButton161.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton161);

        jButton162.setText(" ");
        jButton162.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton162);

        jButton163.setText(" ");
        jButton163.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton163);

        jButton164.setText(" ");
        jButton164.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton164);

        jButton165.setText(" ");
        jButton165.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton165);

        jButton166.setText(" ");
        jButton166.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton166);

        jButton167.setText(" ");
        jButton167.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton167);

        jButton168.setText(" ");
        jButton168.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton168);

        jButton169.setText(" ");
        jButton169.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton169);

        jButton170.setText(" ");
        jButton170.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton170);

        jButton171.setText(" ");
        jButton171.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton171);

        jButton172.setText(" ");
        jButton172.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton172);

        jButton173.setText(" ");
        jButton173.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton173);

        jButton174.setText(" ");
        jButton174.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton174);

        jButton175.setText(" ");
        jButton175.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton175);

        jButton176.setText(" ");
        jButton176.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton176);

        jButton177.setText(" ");
        jButton177.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton177);

        jButton178.setText(" ");
        jButton178.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton178);

        jButton179.setText(" ");
        jButton179.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton179);

        jButton180.setText(" ");
        jButton180.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton180);

        jButton181.setText(" ");
        jButton181.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton181);

        jButton182.setText(" ");
        jButton182.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton182);

        jButton183.setText(" ");
        jButton183.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton183);

        jButton184.setText(" ");
        jButton184.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton184);

        jButton185.setText(" ");
        jButton185.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton185);

        jButton186.setText(" ");
        jButton186.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton186);

        jButton187.setText(" ");
        jButton187.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton187);

        jButton188.setText(" ");
        jButton188.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton188);

        jButton189.setText(" ");
        jButton189.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton189);

        jButton190.setText(" ");
        jButton190.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton190);

        jButton191.setText(" ");
        jButton191.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton191);

        jButton192.setText(" ");
        jButton192.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton192);

        jButton193.setText(" ");
        jButton193.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton193);

        jButton194.setText(" ");
        jButton194.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton194);

        jButton195.setText(" ");
        jButton195.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton195);

        jButton196.setText(" ");
        jButton196.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton196);

        jButton197.setText(" ");
        jButton197.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton197);

        jButton198.setText(" ");
        jButton198.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton198);

        jButton199.setText(" ");
        jButton199.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton199);

        jButton200.setText(" ");
        jButton200.setPreferredSize(new java.awt.Dimension(35, 35));
        p2Panel.add(jButton200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(p1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(p2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void p1ActionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionHandler
        // TODO add your handling code here:
        //HANDLE ACTIONS
        JButton b = (JButton)evt.getSource();
        Ship.point p;
        if(p1Turn){
            p = getCoordsp1(b);
            System.out.println(p.x + " " + p.y);
        }
        else{
            p=getCoordsp2(b);
            System.out.println(p.x + " " + p.y);
        }
         
        if(placeShips){
            if(p1Turn){
                
            }
        }
        else{
            if(p1Turn){

            }
        }
    }//GEN-LAST:event_p1ActionHandler

    private void p2ActionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionHandler
        // TODO add your handling code here:
        //HANDLE ACTIONS
        JButton b = (JButton)evt.getSource();
        Ship.point p;
        if(p1Turn){
            p = getCoordsp1(b);
            System.out.println(p.x + " " + p.y);
        }
        else{
            p=getCoordsp2(b);
            System.out.println(p.x + " " + p.y);
        }
         
        if(placeShips){
            if(p1Turn){
                
            }
        }
        else{
            if(p1Turn){

            }
        }
    }//GEN-LAST:event_p2ActionHandler

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p1ActionHandler(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        p1ActionHandler(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        p1ActionHandler(evt);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton100ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void playGame() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleShipGUI().setVisible(true);
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton158;
    private javax.swing.JButton jButton159;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton160;
    private javax.swing.JButton jButton161;
    private javax.swing.JButton jButton162;
    private javax.swing.JButton jButton163;
    private javax.swing.JButton jButton164;
    private javax.swing.JButton jButton165;
    private javax.swing.JButton jButton166;
    private javax.swing.JButton jButton167;
    private javax.swing.JButton jButton168;
    private javax.swing.JButton jButton169;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton170;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton175;
    private javax.swing.JButton jButton176;
    private javax.swing.JButton jButton177;
    private javax.swing.JButton jButton178;
    private javax.swing.JButton jButton179;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton180;
    private javax.swing.JButton jButton181;
    private javax.swing.JButton jButton182;
    private javax.swing.JButton jButton183;
    private javax.swing.JButton jButton184;
    private javax.swing.JButton jButton185;
    private javax.swing.JButton jButton186;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton189;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton191;
    private javax.swing.JButton jButton192;
    private javax.swing.JButton jButton193;
    private javax.swing.JButton jButton194;
    private javax.swing.JButton jButton195;
    private javax.swing.JButton jButton196;
    private javax.swing.JButton jButton197;
    private javax.swing.JButton jButton198;
    private javax.swing.JButton jButton199;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton200;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel p1Panel;
    private javax.swing.JPanel p2Panel;
    // End of variables declaration//GEN-END:variables
}
