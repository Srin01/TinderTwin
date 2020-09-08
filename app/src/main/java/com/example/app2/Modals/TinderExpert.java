package com.example.app2.Modals;

import com.example.app2.R;

public class TinderExpert
{
    private int index = 1;
    final private Integer[] profile = {
            R.drawable.kamlesh,
            R.drawable.kokilaben,
            R.drawable.mattman,
            R.drawable.ranumondal,
            R.drawable.joey,
            R.drawable.gopibahu,
            R.drawable.binod
    };

    final private String[] profileDescription = {
            "Naam he kamlesh, baag ke aya me, desi gum pasad he muje",
            "Cooker se chaane nikaal kar kaali cooker gas pe koun chadaya , Koun??? ",
            "Me president hu America ka!!! Matt manna",
            "Teri meri kahani he , par muje sunayi nahi dera he",
            "I dont share my fooooood",
            "Excellent in dish washing and electronic items washing ",
            "Apun akele ekhi raat me pamous hogaya"
    };

    final private String[] profileName = {
            "Kamlesh",
            "KokilaBen",
            "President",
            "RanuMandal",
            "Joey",
            "GopiBahu",
            "Binod"
    };


    final private String[] profileDescriptionExtra = {
            "Naam he kamlesh, baag ke aya me, desi gum pasad he muje",
            "Cooker se chaane nikaal kar kaali cooker gas pe koun chadaya , Koun??? ",
            "Me president hu America ka!!! Matt manna",
            "Teri meri kahani he , par muje sunayi nahi dera he",
            "I dont share my fooooood",
            "Excellent in dish washing and electronic items washing ",
            "Apun akele ekhi raat me pamous hogaya"
    };

    final private String[] age = {
            "10",
            "54",
            "8",
            "56",
            "34",
            "26",
            "unknown"
    };

    final private String[] sex = {
            "Male",
            "Female",
            "Male",
            "Female",
            "Male",
            "Female",
            "Male"
    };

    int one;
    public Integer nextImage()
    {
        one = getIndex();
        return profile[one];
    }

    public int getOne() { return one;}

    public String nextDescription()
    {
        return profileDescription[one];
    }

    public String nextName()
    {
        return profileName[one];
    }

    public String nextName(int one)
    {
        return profileName[one];
    }



    public String nextAge(int one)
    {
        return age[one];
    }

    public String getSex(int one)
    {
        return sex[one];
    }

    public String nextExtraDescription(int index) { return profileDescriptionExtra[index];}



    private int getIndex()
    {
        if(index < profile.length)
                return index++;
        else
            return index = 0;
    }
}
