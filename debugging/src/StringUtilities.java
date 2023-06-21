public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int chartAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c);
        chartAdded ++;
    }
}
