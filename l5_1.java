public class l5_1 {
    public static class Word {
        private String word;

        public Word(String word) {
            this.word = word;
        }

        public Word() {
            this.word = "";
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        @Override
        public String toString(){
            return word;
        }

        public boolean equals(Word other){
            if (word == null)
                return other.word == null;
            return this.word.equals(other.word);
        }

        @Override
        public int hashCode(){
            int p = 31;
            int hash = 0;
            long p_pow = 1;
            for(int i = 0; i <this.word.length(); i++){
                hash = (int)(hash + (this.word.charAt(i) - 'a' + 1) * p_pow);
                p_pow = p_pow*p;
            }
            return hash;
        }


    }

    public static class Sentence {
        private Word[] words;

        public Sentence(){}

        public Sentence(Word[] words) {
            this.words = words.clone();
        }

        public Word[] getWords() {
            return words;
        }

        public void setWords(Word[] words) {
            this.words = words;
        }

        @Override
        public String toString(){
            String res = "";
            for(Word s: words){
                res += s.toString() + " ";
            }
            res = res.substring(0, res.length() - 1) + ".";
            return res;
        }

        public boolean equals(Sentence other){
            if (words == null)
                return other.words == null;
            if(words.length != other.words.length)
                return false;
            for(int i = 0; i < words.length; i++)
            {
                if(!words[i].equals(other.words[i]))
                    return false;
            }
            return true;
        }

        @Override
        public int hashCode(){
            int p = 31;
            int hash = 0;
            long p_pow = 1;
            for(Word s: words){
                hash = (int)(hash + s.hashCode() * p_pow);
                p_pow = p_pow*p;
            }
            return hash;
        }
    }

    public static class Text {
        private Sentence[] text;

        public Text() {}
        public Text(Sentence[] text) {
            this.text = text;
        }

        public Sentence[] getText() {
            return text;
        }

        public void setText(Sentence[] text) {
            this.text = text;
        }

        @Override
        public String toString(){
            String res = "";
            for(Sentence s: text){
                res += s.toString();
            }
            return res;
        }

        public boolean equals(Text other){
            if (text == null)
                return other.text == null;
            if(text.length != other.text.length)
                return false;
            for(int i = 0; i < text.length; i++)
            {
                if(!text[i].equals(other.text[i]))
                    return false;
            }
            return true;
        }

        @Override
        public int hashCode(){
            int p = 31;
            int hash = 0;
            long p_pow = 1;
            for(Sentence s: text){
                hash = (int)(hash + s.hashCode() * p_pow);
                p_pow = p_pow*p;
            }
            return hash;
        }
    }

    public class Main {
        public static void main(String[] args){
            Word word1 = new Word("First");
            Word word2 = new Word("Second");
            Word word3 = new Word("Third");
            Word mas[] = new Word[]{word1, word2, word3};
            Sentence sentence1 = new Sentence(mas);
            Sentence sentence2 = new Sentence(mas);
            Sentence sentence3 = new Sentence(mas);
            Sentence mas2[] = new Sentence[]{sentence1, sentence2, sentence3};
            Text text = new Text(mas2);
            Text text2 = new Text(mas2);
            System.out.println(text);
            System.out.println(text.equals(text2));
            System.out.println(text.hashCode());
        }
    }

}
