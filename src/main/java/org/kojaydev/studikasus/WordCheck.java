package org.kojaydev.studikasus;

public class WordCheck {
    private String word;
    private int consonan = 0;
    private int vokal = 0;

    public WordCheck(String word){
        this.word = word;
    }

    public String numCheck(){
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o'){
                this.vokal++;
            }else if(word.charAt(i) != 'a' || word.charAt(i) != 'i' || word.charAt(i) != 'u' || word.charAt(i) != 'e' || word.charAt(i) != 'o'){
                this.consonan++;
            }
        }

        return "Consonan: " + consonan + " Vokal: " + vokal;
    }

    @Override
    public String toString() {
        return "WordCheck{" +
                "word='" + word + '\'' +
                ", consonan=" + consonan +
                ", vokal=" + vokal +
                '}';
    }
}
