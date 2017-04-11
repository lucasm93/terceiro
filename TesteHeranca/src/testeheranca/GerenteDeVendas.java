/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

/**
 *
 * @author Professor
 */
public class GerenteDeVendas extends Vendedor{
private String senha;
private int numeroFuncionarios;



public void incrementarNumeroFuncionarios() {
this.numeroFuncionarios=this.numeroFuncionarios+1;   
}



public boolean darAumento(Vendedor vend, double aumento, String senha) {
if(senha.equals(this.senha)) {
if(vend.gerente.registro=this.registro)
setSalarioBase(vend.salarioBase*(1+aumento);


vend.salarioBase=(1+aumento)*vend.salarioBase;
    
}

    
    return false;
else
    return true;    
}


}