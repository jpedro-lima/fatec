/*
	João Pedro Correia de Lima
	RA: 1430482313040
	Data: 13/03/2023
*/

#include <stdio.h>
#include <stdlib.h>

// int	main(int argc, char **argv)
// {
// 	double A, B, C;

// 	if (argc == 4)
// 	{
// 		A = atoi(argv[1]);
// 		B = atoi(argv[2]);
// 		C = atoi(argv[3]);
// 		if (A < (B + C) && B < (A + C) && C < (A + B))
// 			printf("É um triângulo\n");
// 		else
// 			printf("Não é um triângulo\n");
// 	}
// 	else
// 		printf("Input error\n");
// 	return (0);
// }


int	main(void)
{
	long	cpf;
	int		dependentes;
	double	renda_anual;
	int		renda;

	printf("Insira o cpf: ");
	scanf("%ld", &cpf);
	printf("Insira a quantidade de dependentes: ");
	scanf("%d", &dependentes);
	printf("Insira a renda anual: ");
	scanf("%lf", &renda_anual);
	if (!cpf || !renda_anual)
		printf("Input Error\n");
	else
	{
		renda = renda_anual - (6000 * dependentes);
		if (renda >= 100000)
			printf("CPF: %ld\nImposto à pagar = %.2f\n", cpf, renda * 0.15);
		else if (renda >= 50000)
			printf("CPF: %ld\nimposto à pagar = %.2f\n", cpf, renda * 0.10);
		else if (renda >= 20000)
			printf("CPF: %ld\nimposto à pagar = %.2f\n", cpf, renda * 0.05);
		else
			printf("CPF: %ld está isento\n", cpf);
	}
}