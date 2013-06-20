PoE - XP/Currency % by Level
by Wruntjunior aka Jacob Smith of GReY Online

************************************]Introduction[*********************************************************************
This is the program version of a spreadsheet I've had since right after I started playing PoE.  I converted it to a
program in order to be able to give to my friends, so that they would have a more user-friendly experience than a
spreadsheet (and so I have the same benefit for myself); however, I realized that this program may be useful for some
players, too.  I figure most people wind up with similar spreadsheets, but if this winds up being of use to even a
handfull of people, it's worth the time spent.

If you see an error in my formulas, please contact me with the correction so I can get a corrected version out.


************************************]Installation[*********************************************************************
simply unzip "PoE XP & Currency Calc.zip" to desired location


************************************]Instructions[*********************************************************************
run PoE XP & Currency Calc
for party play, select party tab; for solo play, select solo tab

Party:
Enter player level
Enter area level
Enter level of party members (for a blank party spot, enter 0)
Click "Update" button for XP% and currency drop% to be displayed
	Assumes all of party is close enough to receive party benefit
	Currency % is % chance of currency drop as a direct result of you - does not account for allocation or party member %

	  	chance

Solo:
Enter player level
Enter area level
Click "Update" button for XP% and currency drop% to be displayed


************************************]Math Information (For those interested)[******************************************
Formulas taken from Unofficial Path of Exile Wiki (http://en.pathofexilewiki.com/wiki/Path_of_Exile_Wiki)

Final Experience = [(PlayerLevel + 5) / (PlayerLevel + 5 + EffectiveDifference^2.5)]^1.5

Player Share = (Level+10)^2.71

Party Experience % = Sum Party Share/Player Share

Party Final Experience = Final Experience * 1.3 * [1 + ([party size - 1] * .5)] * Party Experience %

Currency Drops = 2.5 * (playerLevel - (areaLevel + 2)

	(caps player level at 68)

Currency/XP amounts rounded to nearest thousandth of a percent.


************************************]Contact Information[**************************************************************
Any questions or concerns can be sent to ayasustanan@gmail.com
repository at https://github.com/Wrunt/PoECalc


************************************]Version History[******************************************************************
v1.4 - new feature (slider for player #) implemented
v1.3 - cleaned backdrop version - smaller picture w/ black background
v1.2 - now with backdrop!
v1.1 - fixed issue with currency amount for area levels near player level
v1.0 - Initial Release
