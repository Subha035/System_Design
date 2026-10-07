import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Object of Player Class :
        Player player1 = new Player(1, "Rohit", "Batsman");
        Player player2 = new Player(2, "Rickelton", "WK-Batsman");
        Player player3 = new Player(3, "Tilak", "Batsman");
        Player player4 = new Player(4, "Surya", "Batsman");
        Player player5 = new Player(5, "Jacks", "Batsman");
        Player player6 = new Player(6, "Hardik", "Batsman");
        Player player7 = new Player(7, "Ghazanfar ", "Bowler");
        Player player8 = new Player(8, "Santner", "Bowler");
        Player player9 = new Player(9, "Deepak", "Bowler");
        Player player10 = new Player(10, "Boult", "Bowler");
        Player player11 = new Player(11, "Bumrah", "Bowler");

        
        Player player12 = new Player(12, "Virat", "Batsman");
        Player player13 = new Player(13, "Salt", "Batsman");
        Player player14 = new Player(14, "Dev", "Batsman");
        Player player15 = new Player(15, "Rajat", "Batsman");
        Player player16 = new Player(16, "David", "Batsman");
        Player player17 = new Player(17, "Jitesh", "WK-Batsman");
        Player player18 = new Player(18, "Romario", "Bowler");
        Player player19 = new Player(19, "Krunal", "Bowler");
        Player player20 = new Player(20, "Suyesh", "Bowler");
        Player player21 = new Player(21, "Bhuvi", "Bowler");
        Player player22 = new Player(22, "Hazelwood", "Bowler");


        // Insert All players into a ArrayList:
        ArrayList<Player> playerArrayList = new ArrayList<>();
        playerArrayList.add(player1);
        playerArrayList.add(player2);
        playerArrayList.add(player3);
        playerArrayList.add(player4);
        playerArrayList.add(player5);
        playerArrayList.add(player6);
        playerArrayList.add(player7);
        playerArrayList.add(player8);
        playerArrayList.add(player9);
        playerArrayList.add(player10);
        playerArrayList.add(player11);
        playerArrayList.add(player12);
        playerArrayList.add(player13);
        playerArrayList.add(player14);
        playerArrayList.add(player15);
        playerArrayList.add(player16);
        playerArrayList.add(player17);
        playerArrayList.add(player18);
        playerArrayList.add(player19);
        playerArrayList.add(player20);
        playerArrayList.add(player21);
        playerArrayList.add(player22);
        

        // Craete Object of Address Class :
        Address address2 = new Address(1, "South India");
        Address address1 = new Address(2, "North India");


        //Insert All Address into a ArrayList :
        ArrayList<Address> addressArrayList = new ArrayList<>();
        addressArrayList.add(address1);
        addressArrayList.add(address2);


        // Create Object of Stadium Class:
        Stadium stadium1 = new Stadium(1, address1, "Bengaluru");
        Stadium stadium2 = new Stadium(2, address2, "Dharmasala");
        Stadium stadium3 = new Stadium(3, address1, "Chennai");
        Stadium stadium4 = new Stadium(4, address2, "Mohali");
        Stadium stadium5 = new Stadium(5, address1, "Hyderabad");
        Stadium stadium6 = new Stadium(6, address2, "Mumbai");

        // Insert All Stadium into a Single ArrayList:
        ArrayList<Stadium> stadiumArrayList = new ArrayList<>();
        stadiumArrayList.add(stadium1);
        stadiumArrayList.add(stadium2);
        stadiumArrayList.add(stadium3);
        stadiumArrayList.add(stadium4);
        stadiumArrayList.add(stadium5);
        stadiumArrayList.add(stadium6);


        // Create Object of Team Class :
        Team team1 = new Team(1, "MI", player1);
        Team team2 = new Team(2, "RCB", player1);
        Team team3 = new Team(3, "CSK", player1);
        Team team4 = new Team(4, "SRH", player1);
        Team team5 = new Team(5, "DC", player1);
        Team team6 = new Team(6, "KKR", player1);

        // Add Player into Team :
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);
        team1.addPlayer(player4);
        team1.addPlayer(player5);
        team1.addPlayer(player6);
        team1.addPlayer(player7);
        team1.addPlayer(player8);
        team1.addPlayer(player9);
        team1.addPlayer(player10);
        team1.addPlayer(player11);

        team2.addPlayer(player12);
        team2.addPlayer(player13);
        team2.addPlayer(player14);
        team2.addPlayer(player15);
        team2.addPlayer(player16);
        team2.addPlayer(player17);
        team2.addPlayer(player18);
        team2.addPlayer(player19);
        team2.addPlayer(player20);
        team2.addPlayer(player21);
        team2.addPlayer(player22);

        // Add All Team into a ArrayList:
        ArrayList<Team> teamArrayList = new ArrayList<>();
        teamArrayList.add(team1);
        teamArrayList.add(team2);
        teamArrayList.add(team3);
        teamArrayList.add(team4);
        teamArrayList.add(team5);
        teamArrayList.add(team6);

// =========================================================================
// INNINGS 1 (OVERS 1 - 10)
// Batting: Team 1 (player1 to player11) | Bowling: Team 2 (player12 to player22)
// =========================================================================

// ==================== OVER 1 ====================
        // =========================================================================
// INNINGS 1 (OVERS 1 - 10)
// Batting: Team 1 (player1 to player11) | Bowling: Team 2 (player12 to player22)
// =========================================================================

// ==================== OVER 1 ====================
        Ball ball1 = new Ball(1, false, 2, player1, player22);
        Ball ball2 = new Ball(2, false, 0, player1, player22);
        Ball ball3 = new Ball(3, false, 6, player1, player22);
        Ball ball4 = new Ball(4, false, 1, player1, player22);
        Ball ball5 = new Ball(5, true, 0, player2, player22); // OUT
        Ball ball6 = new Ball(6, false, 2, player3, player22);

        Over over1 = new Over(1, ball1);
        over1.addBall(ball1);
        over1.addBall(ball2);
        over1.addBall(ball3);
        over1.addBall(ball4);
        over1.addBall(ball5);
        over1.addBall(ball6);

// ==================== OVER 2 ====================
        Ball ball7 = new Ball(1, false, 1, player1, player21);
        Ball ball8 = new Ball(2, false, 6, player3, player21);
        Ball ball9 = new Ball(3, false, 4, player3, player21);
        Ball ball10 = new Ball(4, false, 3, player3, player21);
        Ball ball11 = new Ball(5, false, 6, player1, player21);
        Ball ball12 = new Ball(6, false, 2, player1, player21);

        Over over2 = new Over(2, ball7);
        over2.addBall(ball7);
        over2.addBall(ball8);
        over2.addBall(ball9);
        over2.addBall(ball10);
        over2.addBall(ball11);
        over2.addBall(ball12);

// ==================== OVER 3 ====================
        Ball ball13 = new Ball(1, false, 1, player3, player20);
        Ball ball14 = new Ball(2, false, 4, player3, player20);
        Ball ball15 = new Ball(3, false, 0, player3, player20);
        Ball ball16 = new Ball(4, false, 2, player3, player20);
        Ball ball17 = new Ball(5, false, 1, player3, player20);
        Ball ball18 = new Ball(6, true, 0, player1, player20); // OUT

        Over over3 = new Over(3, ball13);
        over3.addBall(ball13);
        over3.addBall(ball14);
        over3.addBall(ball15);
        over3.addBall(ball16);
        over3.addBall(ball17);
        over3.addBall(ball18);

// ==================== OVER 4 ====================
        Ball ball19 = new Ball(1, false, 0, player4, player19);
        Ball ball20 = new Ball(2, false, 1, player4, player19);
        Ball ball21 = new Ball(3, false, 4, player3, player19);
        Ball ball22 = new Ball(4, false, 6, player3, player19);
        Ball ball23 = new Ball(5, false, 1, player3, player19);
        Ball ball24 = new Ball(6, false, 0, player4, player19);

        Over over4 = new Over(4, ball19);
        over4.addBall(ball19);
        over4.addBall(ball20);
        over4.addBall(ball21);
        over4.addBall(ball22);
        over4.addBall(ball23);
        over4.addBall(ball24);

// ==================== OVER 5 ====================
        Ball ball25 = new Ball(1, false, 2, player4, player18);
        Ball ball26 = new Ball(2, false, 2, player4, player18);
        Ball ball27 = new Ball(3, true, 0, player4, player18); // OUT
        Ball ball28 = new Ball(4, false, 1, player5, player18);
        Ball ball29 = new Ball(5, false, 0, player3, player18);
        Ball ball30 = new Ball(6, false, 4, player3, player18);

        Over over5 = new Over(5, ball25);
        over5.addBall(ball25);
        over5.addBall(ball26);
        over5.addBall(ball27);
        over5.addBall(ball28);
        over5.addBall(ball29);
        over5.addBall(ball30);

// ==================== OVER 6 ====================
        Ball ball31 = new Ball(1, false, 1, player3, player17);
        Ball ball32 = new Ball(2, false, 1, player5, player17);
        Ball ball33 = new Ball(3, false, 6, player3, player17);
        Ball ball34 = new Ball(4, false, 0, player3, player17);
        Ball ball35 = new Ball(5, false, 2, player3, player17);
        Ball ball36 = new Ball(6, false, 1, player3, player17);

        Over over6 = new Over(6, ball31);
        over6.addBall(ball31);
        over6.addBall(ball32);
        over6.addBall(ball33);
        over6.addBall(ball34);
        over6.addBall(ball35);
        over6.addBall(ball36);

// ==================== OVER 7 ====================
        Ball ball37 = new Ball(1, false, 4, player3, player22);
        Ball ball38 = new Ball(2, false, 4, player3, player22);
        Ball ball39 = new Ball(3, false, 1, player3, player22);
        Ball ball40 = new Ball(4, false, 0, player5, player22);
        Ball ball41 = new Ball(5, true, 0, player5, player22); // OUT
        Ball ball42 = new Ball(6, false, 1, player6, player22);

        Over over7 = new Over(7, ball37);
        over7.addBall(ball37);
        over7.addBall(ball38);
        over7.addBall(ball39);
        over7.addBall(ball40);
        over7.addBall(ball41);
        over7.addBall(ball42);

// ==================== OVER 8 ====================
        Ball ball43 = new Ball(1, false, 2, player6, player21);
        Ball ball44 = new Ball(2, false, 1, player6, player21);
        Ball ball45 = new Ball(3, false, 1, player3, player21);
        Ball ball46 = new Ball(4, false, 4, player6, player21);
        Ball ball47 = new Ball(5, false, 6, player6, player21);
        Ball ball48 = new Ball(6, false, 0, player6, player21);

        Over over8 = new Over(8, ball43);
        over8.addBall(ball43);
        over8.addBall(ball44);
        over8.addBall(ball45);
        over8.addBall(ball46);
        over8.addBall(ball47);
        over8.addBall(ball48);

// ==================== OVER 9 ====================
        Ball ball49 = new Ball(1, false, 1, player6, player20);
        Ball ball50 = new Ball(2, false, 2, player3, player20);
        Ball ball51 = new Ball(3, false, 0, player3, player20);
        Ball ball52 = new Ball(4, true, 0, player3, player20); // OUT
        Ball ball53 = new Ball(5, false, 1, player7, player20);
        Ball ball54 = new Ball(6, false, 6, player6, player20);

        Over over9 = new Over(9, ball49);
        over9.addBall(ball49);
        over9.addBall(ball50);
        over9.addBall(ball51);
        over9.addBall(ball52);
        over9.addBall(ball53);
        over9.addBall(ball54);

// ==================== OVER 10 ====================
        Ball ball55 = new Ball(1, false, 4, player6, player19);
        Ball ball56 = new Ball(2, false, 4, player6, player19);
        Ball ball57 = new Ball(3, false, 2, player6, player19);
        Ball ball58 = new Ball(4, false, 6, player6, player19);
        Ball ball59 = new Ball(5, false, 1, player6, player19);
        Ball ball60 = new Ball(6, false, 2, player7, player19);

        Over over10 = new Over(10, ball55);
        over10.addBall(ball55);
        over10.addBall(ball56);
        over10.addBall(ball57);
        over10.addBall(ball58);
        over10.addBall(ball59);
        over10.addBall(ball60);

// =========================================================================
// INNINGS 2 (OVERS 11 - 20)
// Batting: Team 2 (player12 to player22) | Bowling: Team 1 (player1 to player11)
// =========================================================================

// ==================== OVER 11 ====================
        Ball ball61 = new Ball(1, false, 2, player12, player11);
        Ball ball62 = new Ball(2, false, 1, player12, player11);
        Ball ball63 = new Ball(3, false, 0, player13, player11);
        Ball ball64 = new Ball(4, true, 0, player13, player11); // OUT
        Ball ball65 = new Ball(5, false, 1, player14, player11);
        Ball ball66 = new Ball(6, false, 1, player12, player11);

        Over over11 = new Over(11, ball61);
        over11.addBall(ball61);
        over11.addBall(ball62);
        over11.addBall(ball63);
        over11.addBall(ball64);
        over11.addBall(ball65);
        over11.addBall(ball66);

// ==================== OVER 12 ====================
        Ball ball67 = new Ball(1, false, 1, player12, player10);
        Ball ball68 = new Ball(2, false, 4, player14, player10);
        Ball ball69 = new Ball(3, false, 1, player14, player10);
        Ball ball70 = new Ball(4, false, 2, player12, player10);
        Ball ball71 = new Ball(5, false, 0, player12, player10);
        Ball ball72 = new Ball(6, false, 1, player12, player10);

        Over over12 = new Over(12, ball67);
        over12.addBall(ball67);
        over12.addBall(ball68);
        over12.addBall(ball69);
        over12.addBall(ball70);
        over12.addBall(ball71);
        over12.addBall(ball72);

// ==================== OVER 13 ====================
        Ball ball73 = new Ball(1, false, 0, player12, player9);
        Ball ball74 = new Ball(2, false, 1, player12, player9);
        Ball ball75 = new Ball(3, false, 2, player14, player9);
        Ball ball76 = new Ball(4, false, 1, player14, player9);
        Ball ball77 = new Ball(5, false, 4, player12, player9);
        Ball ball78 = new Ball(6, false, 1, player12, player9);

        Over over13 = new Over(13, ball73);
        over13.addBall(ball73);
        over13.addBall(ball74);
        over13.addBall(ball75);
        over13.addBall(ball76);
        over13.addBall(ball77);
        over13.addBall(ball78);

// ==================== OVER 14 ====================
        Ball ball79 = new Ball(1, false, 1, player12, player8);
        Ball ball80 = new Ball(2, false, 1, player14, player8);
        Ball ball81 = new Ball(3, false, 0, player12, player8);
        Ball ball82 = new Ball(4, false, 2, player12, player8);
        Ball ball83 = new Ball(5, false, 1, player12, player8);
        Ball ball84 = new Ball(6, false, 6, player14, player8);

        Over over14 = new Over(14, ball79);
        over14.addBall(ball79);
        over14.addBall(ball80);
        over14.addBall(ball81);
        over14.addBall(ball82);
        over14.addBall(ball83);
        over14.addBall(ball84);

// ==================== OVER 15 ====================
        Ball ball85 = new Ball(1, false, 2, player14, player7);
        Ball ball86 = new Ball(2, false, 1, player14, player7);
        Ball ball87 = new Ball(3, false, 4, player12, player7);
        Ball ball88 = new Ball(4, false, 1, player12, player7);
        Ball ball89 = new Ball(5, false, 1, player14, player7);
        Ball ball90 = new Ball(6, false, 0, player12, player7);

        Over over15 = new Over(15, ball85);
        over15.addBall(ball85);
        over15.addBall(ball86);
        over15.addBall(ball87);
        over15.addBall(ball88);
        over15.addBall(ball89);
        over15.addBall(ball90);

// ==================== OVER 16 ====================
        Ball ball91 = new Ball(1, false, 4, player14, player11);
        Ball ball92 = new Ball(2, false, 2, player14, player11);
        Ball ball93 = new Ball(3, false, 6, player14, player11);
        Ball ball94 = new Ball(4, false, 1, player14, player11);
        Ball ball95 = new Ball(5, false, 2, player12, player11);
        Ball ball96 = new Ball(6, false, 4, player12, player11);

        Over over16 = new Over(16, ball91);
        over16.addBall(ball91);
        over16.addBall(ball92);
        over16.addBall(ball93);
        over16.addBall(ball94);
        over16.addBall(ball95);
        over16.addBall(ball96);

// ==================== OVER 17 ====================
        Ball ball97 = new Ball(1, false, 1, player14, player10);
        Ball ball98 = new Ball(2, false, 6, player12, player10);
        Ball ball99 = new Ball(3, false, 0, player12, player10);
        Ball ball100 = new Ball(4, false, 4, player12, player10);
        Ball ball101 = new Ball(5, false, 1, player12, player10);
        Ball ball102 = new Ball(6, false, 2, player14, player10);

        Over over17 = new Over(17, ball97);
        over17.addBall(ball97);
        over17.addBall(ball98);
        over17.addBall(ball99);
        over17.addBall(ball100);
        over17.addBall(ball101);
        over17.addBall(ball102);

// ==================== OVER 18 ====================
        Ball ball103 = new Ball(1, false, 2, player12, player9);
        Ball ball104 = new Ball(2, false, 4, player12, player9);
        Ball ball105 = new Ball(3, false, 1, player12, player9);
        Ball ball106 = new Ball(4, false, 6, player14, player9);
        Ball ball107 = new Ball(5, true, 0, player14, player9); // OUT
        Ball ball108 = new Ball(6, false, 1, player15, player9);

        Over over18 = new Over(18, ball103);
        over18.addBall(ball103);
        over18.addBall(ball104);
        over18.addBall(ball105);
        over18.addBall(ball106);
        over18.addBall(ball107);
        over18.addBall(ball108);

// ==================== OVER 19 ====================
        Ball ball109 = new Ball(1, false, 6, player12, player8);
        Ball ball110 = new Ball(2, false, 1, player12, player8);
        Ball ball111 = new Ball(3, false, 4, player15, player8);
        Ball ball112 = new Ball(4, false, 2, player15, player8);
        Ball ball113 = new Ball(5, false, 0, player15, player8);
        Ball ball114 = new Ball(6, false, 6, player15, player8);

        Over over19 = new Over(19, ball109);
        over19.addBall(ball109);
        over19.addBall(ball110);
        over19.addBall(ball111);
        over19.addBall(ball112);
        over19.addBall(ball113);
        over19.addBall(ball114);

// ==================== OVER 20 ====================
        Ball ball115 = new Ball(1, false, 2, player12, player7);
        Ball ball116 = new Ball(2, false, 4, player12, player7);
        Ball ball117 = new Ball(3, false, 1, player12, player7);
        Ball ball118 = new Ball(4, false, 6, player15, player7);
        Ball ball119 = new Ball(5, true, 0, player15, player7); // OUT
        Ball ball120 = new Ball(6, false, 6, player16, player7);

        Over over20 = new Over(20, ball115);
        over20.addBall(ball115);
        over20.addBall(ball116);
        over20.addBall(ball117);
        over20.addBall(ball118);
        over20.addBall(ball119);
        over20.addBall(ball120);

// ==================== ADD ALL BALLS TO ballArrayList ====================
        ArrayList<Ball> ballArrayList = new ArrayList<>();
        ballArrayList.add(ball1);
        ballArrayList.add(ball2);
        ballArrayList.add(ball3);
        ballArrayList.add(ball4);
        ballArrayList.add(ball5);
        ballArrayList.add(ball6);

        ballArrayList.add(ball7);
        ballArrayList.add(ball8);
        ballArrayList.add(ball9);
        ballArrayList.add(ball10);
        ballArrayList.add(ball11);
        ballArrayList.add(ball12);

        ballArrayList.add(ball13);
        ballArrayList.add(ball14);
        ballArrayList.add(ball15);
        ballArrayList.add(ball16);
        ballArrayList.add(ball17);
        ballArrayList.add(ball18);

        ballArrayList.add(ball19);
        ballArrayList.add(ball20);
        ballArrayList.add(ball21);
        ballArrayList.add(ball22);
        ballArrayList.add(ball23);
        ballArrayList.add(ball24);

        ballArrayList.add(ball25);
        ballArrayList.add(ball26);
        ballArrayList.add(ball27);
        ballArrayList.add(ball28);
        ballArrayList.add(ball29);
        ballArrayList.add(ball30);

        ballArrayList.add(ball31);
        ballArrayList.add(ball32);
        ballArrayList.add(ball33);
        ballArrayList.add(ball34);
        ballArrayList.add(ball35);
        ballArrayList.add(ball36);

        ballArrayList.add(ball37);
        ballArrayList.add(ball38);
        ballArrayList.add(ball39);
        ballArrayList.add(ball40);
        ballArrayList.add(ball41);
        ballArrayList.add(ball42);

        ballArrayList.add(ball43);
        ballArrayList.add(ball44);
        ballArrayList.add(ball45);
        ballArrayList.add(ball46);
        ballArrayList.add(ball47);
        ballArrayList.add(ball48);

        ballArrayList.add(ball49);
        ballArrayList.add(ball50);
        ballArrayList.add(ball51);
        ballArrayList.add(ball52);
        ballArrayList.add(ball53);
        ballArrayList.add(ball54);

        ballArrayList.add(ball55);
        ballArrayList.add(ball56);
        ballArrayList.add(ball57);
        ballArrayList.add(ball58);
        ballArrayList.add(ball59);
        ballArrayList.add(ball60);

        ballArrayList.add(ball61);
        ballArrayList.add(ball62);
        ballArrayList.add(ball63);
        ballArrayList.add(ball64);
        ballArrayList.add(ball65);
        ballArrayList.add(ball66);

        ballArrayList.add(ball67);
        ballArrayList.add(ball68);
        ballArrayList.add(ball69);
        ballArrayList.add(ball70);
        ballArrayList.add(ball71);
        ballArrayList.add(ball72);

        ballArrayList.add(ball73);
        ballArrayList.add(ball74);
        ballArrayList.add(ball75);
        ballArrayList.add(ball76);
        ballArrayList.add(ball77);
        ballArrayList.add(ball78);

        ballArrayList.add(ball79);
        ballArrayList.add(ball80);
        ballArrayList.add(ball81);
        ballArrayList.add(ball82);
        ballArrayList.add(ball83);
        ballArrayList.add(ball84);

        ballArrayList.add(ball85);
        ballArrayList.add(ball86);
        ballArrayList.add(ball87);
        ballArrayList.add(ball88);
        ballArrayList.add(ball89);
        ballArrayList.add(ball90);

        ballArrayList.add(ball91);
        ballArrayList.add(ball92);
        ballArrayList.add(ball93);
        ballArrayList.add(ball94);
        ballArrayList.add(ball95);
        ballArrayList.add(ball96);

        ballArrayList.add(ball97);
        ballArrayList.add(ball98);
        ballArrayList.add(ball99);
        ballArrayList.add(ball100);
        ballArrayList.add(ball101);
        ballArrayList.add(ball102);

        ballArrayList.add(ball103);
        ballArrayList.add(ball104);
        ballArrayList.add(ball105);
        ballArrayList.add(ball106);
        ballArrayList.add(ball107);
        ballArrayList.add(ball108);

        ballArrayList.add(ball109);
        ballArrayList.add(ball110);
        ballArrayList.add(ball111);
        ballArrayList.add(ball112);
        ballArrayList.add(ball113);
        ballArrayList.add(ball114);

        ballArrayList.add(ball115);
        ballArrayList.add(ball116);
        ballArrayList.add(ball117);
        ballArrayList.add(ball118);
        ballArrayList.add(ball119);
        ballArrayList.add(ball120);

// ==================== ADD ALL OVERS TO overArrayList ====================
        ArrayList<Over> overArrayList = new ArrayList<>();
        overArrayList.add(over1);
        overArrayList.add(over2);
        overArrayList.add(over3);
        overArrayList.add(over4);
        overArrayList.add(over5);
        overArrayList.add(over6);
        overArrayList.add(over7);
        overArrayList.add(over8);
        overArrayList.add(over9);
        overArrayList.add(over10);
        overArrayList.add(over11);
        overArrayList.add(over12);
        overArrayList.add(over13);
        overArrayList.add(over14);
        overArrayList.add(over15);
        overArrayList.add(over16);
        overArrayList.add(over17);
        overArrayList.add(over18);
        overArrayList.add(over19);
        overArrayList.add(over20);
        Innings innings1 = new Innings(1, team1, team2, 126, 5, over1);
        Innings innings2 = new Innings(2, team2, team1, 128, 3, over11);

        // insert over into Innings :
        // Innings 1: Overs 1 to 10
                innings1.addOver(over1);
        innings1.addOver(over2);
        innings1.addOver(over3);
        innings1.addOver(over4);
        innings1.addOver(over5);
        innings1.addOver(over6);
        innings1.addOver(over7);
        innings1.addOver(over8);
        innings1.addOver(over9);
        innings1.addOver(over10);

// Innings 2: Overs 11 to 20
        innings2.addOver(over11);
        innings2.addOver(over12);
        innings2.addOver(over13);
        innings2.addOver(over14);
        innings2.addOver(over15);
        innings2.addOver(over16);
        innings2.addOver(over17);
        innings2.addOver(over18);
        innings2.addOver(over19);
        innings2.addOver(over20);

        ArrayList<Innings> inningsArrayList = new ArrayList<>();
        inningsArrayList.add(innings1);
        inningsArrayList.add(innings2);


        // Create Object of Match Class :
        Match match1 = new Match(1, innings1, stadium1, team1, team2, MatchStatus.LIVE);
        Match match2 = new Match(2, innings1, stadium2, team2, team1, MatchStatus.ABANDONED);
        Match match3 = new Match(3, innings1, stadium3, team1, team2, MatchStatus.COMPLETED);
        Match match4 = new Match(4, innings1, stadium4, team2, team1, MatchStatus.UPCOMING);
        Match match5 = new Match(5, innings1, stadium5, team1, team2, MatchStatus.LIVE);
        Match match6 = new Match(6, innings1, stadium6, team2, team1, MatchStatus.COMPLETED);
        match1.addInnings(innings1);
        match1.addInnings(innings2);

        match2.addInnings(innings1);
        match2.addInnings(innings2);

        match3.addInnings(innings1);
        match3.addInnings(innings2);

        match4.addInnings(innings1);
        match4.addInnings(innings2);

        match5.addInnings(innings1);
        match5.addInnings(innings2);

        match6.addInnings(innings1);
        match6.addInnings(innings2);

        ArrayList<Match> matchArrayList = new ArrayList<>();
        matchArrayList.add(match1);
        matchArrayList.add(match2);
        matchArrayList.add(match3);
        matchArrayList.add(match4);
        matchArrayList.add(match5);
        matchArrayList.add(match6);


        System.out.println("-------------- Hi, Welcome to Cricbuzz -----------");
        for(int i = 0 ; i < matchArrayList.size(); i++){
            System.out.println(matchArrayList.get(i).getMatchId()+". "+ matchArrayList.get(i).getTeam1().getTeamName()+" vs "+ matchArrayList.get(i).getTeam2().getTeamName()+" ("+ matchArrayList.get(i).getMatchStatus()+")");
        }

            try {
                System.out.println("Enter Which type of match tou want to watch : ");
            String input = sc.nextLine();
            MatchStatus status = MatchStatus.valueOf(input.toUpperCase());
            for (int i = 0; i < matchArrayList.size(); i++) {
                if (matchArrayList.get(i).getMatchStatus() == status) {
                    System.out.println(matchArrayList.get(i).getMatchId() + ". " + matchArrayList.get(i).getTeam1().getTeamName() + " vs " + matchArrayList.get(i).getTeam2().getTeamName() + " (" + matchArrayList.get(i).getMatchStatus() + ")");
                }
            }
            } catch(Exception e){
                System.out.println("You have entered a wrong option");
                return;
            }

        int matchId = 0;
        Match match = null;
        System.out.println("Enter a match ID you want to watch : ");
        int userInput  = sc.nextInt();

        for(int i = 0 ; i < matchArrayList.size() ; i++){
            if(matchArrayList.get(i).getMatchId() == userInput){
                match = matchArrayList.get(i);
                matchId = matchArrayList.get(i).getMatchId();
            }
        }

        if (match == null) {
            System.out.println("Match ID not found.");
            sc.close();
            return;
        }

        String[] option = {"ScoreCard", "Players List", "Summary", "Match Details"};
        for(int i = 0 ; i < option.length ; i++){
            System.out.println(i+1+". "+ option[i]);
        }



        int firstInningsWick = 0;
        int secInningsWick = 0;

        System.out.println("Enter a option id");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                int Run = 0;
                int wick = 0;
                System.out.println("Batting :- ");
                for (int i = 0; i < matchArrayList.size(); i++) {

                    if (matchArrayList.get(i).getMatchId() == matchId) {
                        for (int x = 0; x < inningsArrayList.size(); x++) {
                            System.out.println();
                            System.out.println("Team - " + teamArrayList.get(x).getTeamName());
                            System.out.println();
                            Run = 0;
                            wick = 0;
                            for (int j = 0; j < teamArrayList.get(x).getPlayer().size(); j++) {

                                String playerName = teamArrayList.get(x)
                                        .getPlayer()
                                        .get(j)
                                        .getPlayerName();

                                System.out.print(playerName + " : ");

                                int playerRunCount = 0;
                                int ballCount = 0;
                                boolean playerOut = false;
                                String outBowler = "";

                                int startOver = x * 10;
                                int endOver = Math.min(startOver + 10, overArrayList.size());

                                for (int r = startOver; r < endOver && !playerOut; r++) {

                                    Over tempOver = overArrayList.get(r);

                                    for (int b = 0; b < tempOver.getOvers().size(); b++) {

                                        if (tempOver.getOvers().get(b)
                                                .getBatsmanName()
                                                .equals(playerName)) {

                                            playerRunCount += tempOver.getOvers().get(b).getBallRun();
                                            ballCount++;
                                            Run += tempOver.getOvers().get(b).getBallRun();
                                            if (tempOver.getOvers().get(b).getBallIsOut()) {
                                                outBowler = tempOver.getOvers().get(b).getBowlerName();
                                                wick++;
                                                playerOut = true;
                                                break;
                                            }
                                        }
                                    }

                                }
                                if (ballCount > 0 && !playerOut) {
                                    System.out.println(playerRunCount + "(" + ballCount + ")*");
                                } else if (ballCount > 0 && playerOut) {
                                    System.out.println(playerRunCount + "(" + ballCount + ") b " + outBowler);
                                } else {
                                    System.out.println("DNP");
                                }
                            }
                            if (x == 0) {
                                firstInningsWick = wick;
                            } else {
                                secInningsWick = wick;
                            }
                            System.out.println("                    Total : " + Run + "/" + wick);
                        }
                    }
                }

                System.out.println();
                System.out.println("Bowling :- ");
                System.out.println();

                for (int i = 0; i < matchArrayList.size(); i++) {

                    if (matchArrayList.get(i).getMatchId() == matchId) {

                        for (int x = 0; x < inningsArrayList.size(); x++) {

                            // Opposite team is bowling
                            int bowlingTeamIndex = (x == 0) ? 1 : 0;

                            System.out.println();
                            System.out.println("Team - "
                                    + teamArrayList.get(bowlingTeamIndex).getTeamName());
                            System.out.println();

                            // Overs belonging to this innings
                            int startOver = x * 10;
                            int endOver = Math.min(startOver + 10, overArrayList.size());

                            for (int j = 0;
                                 j < teamArrayList.get(bowlingTeamIndex).getPlayer().size();
                                 j++) {

                                String playerName = teamArrayList
                                        .get(bowlingTeamIndex)
                                        .getPlayer()
                                        .get(j)
                                        .getPlayerName();

                                String playerRole = teamArrayList
                                        .get(bowlingTeamIndex)
                                        .getPlayer()
                                        .get(j)
                                        .getPlayerRole();

                                if (!playerRole.equalsIgnoreCase("Bowler")) {
                                    continue;
                                }

                                int ballCount = 0;
                                int overCount = 0;
                                int totalRun = 0;
                                int totalWicket = 0;

                                for (int r = startOver; r < endOver; r++) {

                                    Over tempOver = overArrayList.get(r);

                                    for (int b = 0;
                                         b < tempOver.getOvers().size();
                                         b++) {

                                        if (tempOver.getOvers().get(b)
                                                .getBowlerName()
                                                .equals(playerName)) {

                                            totalRun += tempOver.getOvers()
                                                    .get(b)
                                                    .getBallRun();

                                            if (tempOver.getOvers()
                                                    .get(b)
                                                    .getBallIsOut()) {
                                                totalWicket++;
                                            }

                                            ballCount++;

                                            if (ballCount == 6) {
                                                overCount++;
                                                ballCount = 0;
                                            }
                                        }
                                    }
                                }

                                if (overCount > 0 || ballCount > 0) {
                                    System.out.println(
                                            playerName
                                                    + " : "
                                                    + overCount + "." + ballCount
                                                    + " - " + totalRun
                                                    + " - " + totalWicket
                                    );
                                }
                            }
                        }
                    }
                }
                break;

            case 2:
                for (int i = 0; i < matchArrayList.size(); i++) {
                    if (matchArrayList.get(i).getMatchId() == matchId) {
                        for (int x = 0; x < inningsArrayList.size(); x++) {
                            System.out.println();
                            System.out.println("Team - " + teamArrayList.get(x).getTeamName());
                            System.out.println();
                            for (int j = 0; j < teamArrayList.get(x).getPlayer().size(); j++) {

                                System.out.println(j + 1 + ". " +
                                        teamArrayList.get(x)
                                                .getPlayer()
                                                .get(j)
                                                .getPlayerName() + " (" +
                                        teamArrayList.get(x)
                                                .getPlayer()
                                                .get(j)
                                                .getPlayerRole() + ")");
                            }
                        }
                    }
                }
                break;
            case 3:
                int first = 0;
                int second = 0;
                int secInningsWickets = 0;

                for (int i = 0; i < matchArrayList.size(); i++) {
                    Match m = matchArrayList.get(i);
                    if (m.getMatchId() == matchId) {

                        // Innings 1 (overs 0 to 9)
                        for (int r = 0; r < 10; r++) {
                            Over ov = overArrayList.get(r);
                            for (int b = 0; b < ov.getOvers().size(); b++) {
                                first += ov.getOvers().get(b).getBallRun();
                            }
                        }

                        // Innings 2 (overs 10 to 19)
                        for (int r = 10; r < 20; r++) {
                            Over ov = overArrayList.get(r);
                            for (int b = 0; b < ov.getOvers().size(); b++) {
                                Ball ball = ov.getOvers().get(b);
                                second += ball.getBallRun();
                                if (ball.getBallIsOut()) {
                                    secInningsWickets++;
                                }
                            }
                        }

                        String team1Name = match.getInnings().get(1).getBattingTeam().getTeamName();
                        String team2Name = match.getInnings().get(1).getBowlingTeam().getTeamName();

                        if (first > second) {
                            System.out.println(team1Name + " won by " + (first - second) + " runs");
                        } else if (second > first) {
                            System.out.println(team2Name + " won by " + (10 - secInningsWickets) + " wickets");
                        } else {
                            System.out.println("Match Tied!");
                        }
                        break;
                    }
                }
                break;

            case 4:
        }
    }
}
