public class Factory {
    public Shape getnew(String type){
        if(type.equalsIgnoreCase("RECTANGULAR")){
            return new Rectangular();
        } else if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("TANGULAR")) {
            return new Trangular();
        }else{
            return null;
        }
    }
}
