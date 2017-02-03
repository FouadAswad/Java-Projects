package lab7;

public class AddListOfAddable {
	public static Addable addList(Addable list[], int numberOfElementsInList){
		Time k = new Time("0 hours 0 minutes");
		for(int i = 0; i < numberOfElementsInList; i++){
			k = ((Time)k.add(list[i]));
		}
		return k;
	}
}
