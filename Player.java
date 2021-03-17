
public class Player {

    private String playerKlasse;
    private String playerName;
    private int playerLevel;
    private int playerStaerke;
    private int playerGeschick;
    private int playerIntelligenz;
    private int playerAusdauer;
    private int playerGlueck;
    private int playerRuestungswert;
    private int WaffenSchaden =1;
    private String Player;
    private int playerCurrExp;
    private int playerNeedExp;

    public Player(String playerKlasse,String playerName, int playerLevel, int playerStaerke, int playerGeschick, int playerIntelligenz, int playerAusdauer, int playerGlueck, int playerRuestungswert){
        this.playerKlasse = playerKlasse;
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerStaerke = playerStaerke;
        this.playerGeschick = playerGeschick;
        this.playerIntelligenz = playerIntelligenz;
        this.playerAusdauer = playerAusdauer;
        this.playerGlueck = playerGlueck;
        this.playerRuestungswert = playerRuestungswert;
        this.playerNeedExp = (playerLevel+1)*(100*(playerLevel+1));
    }


    public void PlayerStats(){
        System.out.println("Dein Player: "+playerName+"\n"+
                "Deine Klasse: "+playerKlasse+"\n"+
                "Dein Level: "+playerLevel+"\n"+
                "Deine Exp: ("+playerCurrExp+"/"+playerNeedExp+")"+"\n"+
                "Stärke: "+playerStaerke+"\n"+
                "Schaden: "+(WaffenSchaden*(1+playerStaerke/10))+"\n");
    }

    public String getPlayer() {
        return Player;
    }

    public void setPlayer(String player) {
        this.Player = player;
    }
}
