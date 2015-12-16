package pokerBase;

import java.util.ArrayList;

import base.GameRuleCardsDAL;
import base.GameRuleDAL;
import domain.CardDomainModel;
import domain.GameRuleCardsDomainModel;
import domain.GameRuleDomainModel;
import enums.eGame;
import enums.eRank;
import enums.eSuit;

public class Rule {

	private int MaxNumberOfPlayers;
	private int PlayerNumberOfCards;
	private int NumberOfJokers;
	private int PlayerCardsMin;
	private int PlayerCardsMax;
	private int CommunityCardsMin;
	private int CommunityCardsMax;
	private int PossibleHandCombinations;
	private int[] iCardsToDraw;
	private ArrayList<CardDomainModel> RuleCards = new ArrayList<CardDomainModel>();
	private eGame Game;

	public Rule(String ruleName){
		for (GameRuleDomainModel gmRule : GameRuleDAL.getRules()){
			if (gmRule.getRULENAME() == ruleName){
				this.MaxNumberOfPlayers = gmRule.getMAXNUMBEROFPLAYERS();
				this.PlayerNumberOfCards = gmRule.getPLAYERNUMBEROFCARDS();
				this.NumberOfJokers = gmRule.getNUMBEROFJOKERS();
				this.PlayerCardsMin = gmRule.getPLAYERCARDSMIN();
				this.PlayerCardsMax = gmRule.getPLAYERCARDSMAX();
				this.CommunityCardsMax = gmRule.getCOMMUNITYCARDSMAX();
				this.CommunityCardsMin = gmRule.getCOMMUNITYCARDSMIN();
				this.PossibleHandCombinations = gmRule.getPOSSIBLEHANDCOMBINATIONS();
			}
		}	
	}
			

	public int GetMaxNumberOfPlayers() {
		return this.MaxNumberOfPlayers;
	}

	public int GetPlayerNumberOfCards() {
		return this.PlayerNumberOfCards;
	}

	public int GetNumberOfJokers() {
		return this.NumberOfJokers;
	}
	
	public int GetCommunityCardsCount()
	{
		return this.CommunityCardsMax;
	}
	
	public ArrayList<CardDomainModel> GetRuleCards()
	{
		return this.RuleCards;
	}
	public eGame GetGame()
	{
		return this.Game;
	}

	public int getCommunityCardsMin() {
		return CommunityCardsMin;
	}

	public void setCommunityCardsMin(int communityCardsMin) {
		CommunityCardsMin = communityCardsMin;
	}

	public int getCommunityCardsMax() {
		return CommunityCardsMax;
	}

	public void setCommunityCardsMax(int communityCardsMax) {
		CommunityCardsMax = communityCardsMax;
	}

	public int getPlayerCardsMin() {
		return PlayerCardsMin;
	}

	public void setPlayerCardsMin(int playerCardsMin) {
		PlayerCardsMin = playerCardsMin;
	}

	public int getPlayerCardsMax() {
		return PlayerCardsMax;
	}
	
	public int getTotalCardsToDraw()
	{
		return this.GetPlayerNumberOfCards() + this.getCommunityCardsMax();
	}

	public void setPlayerCardsMax(int playerCardsMax) {
		PlayerCardsMax = playerCardsMax;
	}

	public int getPossibleHandCombinations() {
		return PossibleHandCombinations;
	}

	public void setPossibleHandCombinations(int possibleHandCombinations) {
		PossibleHandCombinations = possibleHandCombinations;
	}

	public int[] getiCardsToDraw() {
		return iCardsToDraw;
	}

	public void setiCardsToDraw(int[] iCardsToDraw) {
		this.iCardsToDraw = iCardsToDraw;
	}
	
}