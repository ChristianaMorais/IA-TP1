class Node implements Comparable<Node>{
  private int altura;
  private Tabuleiro tabu;
  private Integer heuristica = null;

  public Node(Tabuleiro tabu, int altura, Boolean heur){
    this.altura = altura;
    this.tabu = tabu;
    if (heur) { // se for true efetua-se o calculo da heuristica

    }
  }

  @Override
  public int compareTo(Node p) {
    if(this.heuristica < p.heuristica)
      return -1;
    else
      return 1;
  }
}
