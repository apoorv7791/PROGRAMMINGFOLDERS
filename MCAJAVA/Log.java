class Log {

    String search(String[] cars, String pick) {

        int left = 0;
        int right = cars.length - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if (cars[mid].equals(pick)){
                return cars[mid];
            }

            else if (cars[mid].compareTo(pick) > 0){
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return "Not Found";
    }

    void main(){

        var s = new Log();

        String cars[] = {
            "Hyundai",
            "Kia",
            "Maruti",
            "Mitsubishi",
            "Renault",
            "Toyota"
        };

        String pick = "Renault";

        System.out.println(s.search(cars, pick));
    }
}