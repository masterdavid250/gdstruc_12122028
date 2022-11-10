package com.gdstruc.quiz4;

public class SimpleHashtable {
    private StoredPlayer[] hashtable;

    public SimpleHashtable()
    {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            //linear probing
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey))
        {
            System.out.println("Sorry, there is already an element at position " + hashedKey);
        }
        else
        {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
        {
            return null;
        }
        return hashtable[hashedKey].value;
    }

    //REMOVE
    public Player remove(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
        {
            return null;
        }
        hashtable[hashedKey].value = null;
        return hashtable[hashedKey].value;
    }


    private int findKey(String key)
    {
        int hashedKey = hashKey(key);


        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }


        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        }
        else
        {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex
                && hashtable[hashedKey] != null
                && !hashtable[hashedKey].key.equals(key))
        {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            if (hashtable[i] != null) {
                System.out.println("Element " + i + " " + hashtable[i].value);
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }

/*    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element " + i + " " + hashtable[i]);
        }
    }*/
}
