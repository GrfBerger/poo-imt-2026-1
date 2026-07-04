// Empregado Tipo4 = Horista
// herda de Empregado o atributo salario e o metodo calculaSalario()
public class EmpregadoHorista extends Empregado{
    private double valorHora;
    private int numeroHoras;

   @Override
   public double calculaSalario(){
        return this.valorHora*this.numeroHoras;
   } 
}