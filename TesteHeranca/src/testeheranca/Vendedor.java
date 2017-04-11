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
public class Vendedor {
private double totalVendas;
private double salarioBase;
private double horasExtras;
private double decimoTerceiro; 
private String nomeCompleto;
private String cpf;
private int registro;
private static double taxaComissao;
private GerenteDeVendas gerente;

/*
Cliente(String A, int B, String C,double D, double E,double F,GerenteDeVendas G) {
   this.nomeCompleto=A;
   this.registro = B;
   this.cpf = C;
   this.totalVendas=D;
   this.horasExtras=E;
   this.salarioBase=F;
   this.gerente = G;
   this.gerente.incrementarNumeroFuncionarios();
}
*/

public double calcularComissao() {
return this.taxaComissao*this.totalVendas;
}

public double calcularDecimoTerceiro() {
return this.salarioBase;
}

public double calcularFerias() {
return this.salarioBase*1.333;
}

public double salarioDoMes() {
return this.salarioBase+this.calcularFerias()+this.horasExtras;
}

public void contablizarVenda(double W) {
this.totalVendas=this.totalVendas+W;
}

public double getSalarioBase() {
return this.salarioBase;
}
        
public boolean setSalarioBase(double A) {
  if(A>0) {
    this.salarioBase=A;
    return true;
  } else
  return false;    
}

public double getTaxaComissao() {
return Vendedor.taxaComissao;
}

public boolean setTaxaComissao(double A) {
  if(A>0) {
    Vendedor.taxaComissao=A;
    return true;
  } else
  return false;    
}

public double getHoraExtra() {
return this.horasExtras;
}

public boolean setHoraExtra(double A) {
  if(A>0) {
    this.horasExtras=A;
    return true;
  } else
  return false;    
}


}