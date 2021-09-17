StartingNum = float(input("Enter starting number: "));
HasReachedOne = False;
EndingNum = StartingNum;
NumOfSteps = 0;
while HasReachedOne == False:
	NumOfSteps += 1;
	if(EndingNum % 2 == 0):
		EndingNum = EndingNum/2;
	else:
		EndingNum = (EndingNum * 3) + 1;
	if(EndingNum == 1):
		print("INT: ", StartingNum, " takes ",NumOfSteps," steps to reach 1");
		HasReachedOne = True;
	print(EndingNum);

