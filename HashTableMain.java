package hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable<String, Integer> HashTable = new HashTable();
        String message = "To be or not to be";

        //Convert all the words in lowercase
        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray) {
            //Search for the word in the linked list
            Integer value = HashTable.get(word);
            //If not found, frequency of the word StayWith 1
            if (value == null)
                value = 1;
            else
                //If found, frequency of the word increases by 1
                value = value + 1;
            HashTable.add(word, value);
        }
        System.out.println(HashTable);
    }
}


