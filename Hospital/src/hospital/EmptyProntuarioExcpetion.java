package hospital;

class EmptyProntuarioExcpetion extends Exception {
    public EmptyProntuarioExcpetion(){
        System.out.println("O prontuário não pode estar vazio!\n");
        
    }
}
