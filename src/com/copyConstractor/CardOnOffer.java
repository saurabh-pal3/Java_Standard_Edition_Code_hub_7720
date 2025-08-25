package com.copyConstractor;

public class CardOnOffer 
{
	public static CardType getOfferedCard(Customer cst)
	{
		int creditpoint=cst.getCreditPoint();
		
		if(creditpoint>=100 &&creditpoint<=500)
		{
			return new CardType(cst, "Silver");
		}
			
			else if(creditpoint>=501 &&creditpoint<=1000)
			{
				return new CardType(cst, "Gold");
			}
			else if(creditpoint>1000)
			{
				return new CardType(cst, "Platinum");
			}
			else
			{
				return new CardType(cst, "EMI");
			}
		
		
	}

}
