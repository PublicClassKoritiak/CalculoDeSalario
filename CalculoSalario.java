public class CalculoSalario {
    public static void main(String[] args) {
        var salario = 1800; // Salário do Usuário "Editar"
        var salarioMin = 1621;
        var tetoIR = 5000;
        var salarioAposInss = salario - 7.5 / 100 * salario;
        var qntdSalariosMin = salario / salarioMin;
        var isThisWannaPayIR = false;
        var isThisLegal = false;

        System.out.println("O salário bruto do usuário é de R$" + salario + ".");
        System.out.println("O salário após o desconto do Inss é de R$" + salarioAposInss + " (-7.5%).");
        if (salario >= salarioMin) {
            System.out.println("O salário está dentro das normas de salário da CLT.");
            isThisLegal = true;
        } else {
            System.out.println("O salário não cumpre com as normas de salário da CLT.");
            isThisLegal = false;
        }
        if (salario >= tetoIR) {
            System.out.println("O usuário deve pagar o Imposto de Renda.");
            isThisWannaPayIR = true;
        } else {
            System.out.println("O usuário está isento do Imposto de Renda.");
            isThisWannaPayIR = false;
        }
        if (qntdSalariosMin >= 1) {
            System.out.println("O usuário recebe " + qntdSalariosMin + " salários mínimos.");
        } else {
            System.out.println("O usuário não está dentro das normas da CLT consequentemente não recebe mais que um salário minimo.");;
        }
    }
}

