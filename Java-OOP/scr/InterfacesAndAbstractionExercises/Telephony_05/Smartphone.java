package Telephony_05;

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;



    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb =new StringBuilder();
        for (String url:urls) {
            if(hasDigit(url)){
                sb.append("Invalid URL!").append(System.lineSeparator());
            }else{
                sb.append(String.format("Browsing: %s!%n",url));

            }

            
        }
        return sb.toString().trim();
    }
    private boolean hasDigit(String url){
        for (char singleChar:url.toCharArray()) {
            if(Character.isDigit(singleChar)){
                return true;
            }

        }
        return false;

    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (hasOnlyDigit(number)) {
                sb.append(String.format("Calling... %s%n", number));

            } else {
                sb.append("Invalid number!").append(System.lineSeparator());

            }

        }
        return sb.toString().trim();
    }
    private boolean hasOnlyDigit(String number){
        for (char singleChar:number.toCharArray()) {
            if(!Character.isDigit(singleChar)){
                return false;
            }

        }
        return true;

    }

}
