class Response {
    boolean CheckPasswordIsValid(String password){
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        return true;
    }
    void main(){
        var r = new Response();
        var password = "ApoorvSingh123456&&&%%";
        System.out.println(r.CheckPasswordIsValid(password));
    }
}