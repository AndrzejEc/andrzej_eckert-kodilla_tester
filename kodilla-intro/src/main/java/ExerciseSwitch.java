public class ExerciseSwitch {
    public String getColorName() {
        String userColor = UserDialogs.getUserColorSelection();
        String result="";
        switch (userColor){
            case "RED": result= "Color is red"; break;
            case "GREEN": result= "Color is green"; break;
            case "BLUE": result= "Color is blue"; break;
        };
        return result;
    }

    public static void main(String[] args) {
        //String fullColorName;
        ExerciseSwitch exerciseSwitch = new ExerciseSwitch();
        String fullColorName = exerciseSwitch.getColorName();
        System.out.println(fullColorName);
    }
}

