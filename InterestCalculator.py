StartingAmount = float(input("Starting Amount:"));
Interest = (float(input("Interest Precentage:"))/100) + 1;
Time = int(input("Number of Years:"));
EndingAmount = StartingAmount;
for x in range(Time):
	EndingAmount = EndingAmount * Interest;
print(EndingAmount);
