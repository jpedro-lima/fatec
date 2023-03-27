/*
	João Pedro Correia de Lima
	RA: 1430482313040
	Data: 13/03/2023
*/

#include <stdio.h>
#include <stdlib.h>

// int	main(int argc, char **argv)
// {
// 	float	matriz[2][2];
// 	float	quant;

// 	if (argc == 5)
// 	{
// 		argv++;
// 		matriz[0][0] = atof(*argv++);
// 		matriz[0][1] = atof(*argv++);
// 		matriz[1][0] = atof(*argv++);
// 		matriz[1][1] = atof(*argv);

// 		quant = matriz[0][0] + matriz[0][1] + matriz[1][0] + matriz[1][1];
// 		printf("A média é: %.2f\n", quant / 4);
// 	}
// 	else
// 		printf("Erro de argumento\n");
// }

// int	main(void)
// {
// 	float	matriz[4][2];
// 	float	quant;

// 	for (int i = 0; i < 4; i++)
// 	{
// 		for (int j = 0; j < 2; j++)
// 		{
// 			printf("Informe o número na posição [%d][%d]: ", i, j);
// 			scanf("%f", &matriz[i][j]);
// 			quant += matriz[i][j];
// 		}
// 	}
// 	printf("A média é: %.2f\n", quant / 8);
// }

int	main(void)
{
	float	matriz[10][2];
	float	media_geral;
	float	media_aluno;
	char	name[10][140];


	media_geral = 0;
	for (int i = 0; i < 10; i++)
	{
		printf("Informe o nome do aluno: ");
		scanf("%s", name[i]);
		for (int j = 0; j < 2; j++)
		{
			printf("Informe a nota da P%d: ", j + 1);
			scanf("%f", &matriz[i][j]);
			media_geral += matriz[i][j];
		}
	}
	media_geral /= 20;
	printf("P: %.2f\n", 1.5 * media_geral);
	for (int i = 0; i < 10; i++)
	{
		media_aluno = matriz[i][0] + matriz[i][1] / 2;
		if (matriz[i][1] == 10 || media_aluno >= 7)
			printf("%s nota: %.2f - Aprovado\n", name[i], media_aluno);
		else if (media_aluno >= 5 || media_aluno >= 1.5 * media_geral)
			printf("%s nota: %.2f - Exame\n", name[i], media_aluno);
		else
			printf("%s nota: %.2f - Reprovado\n", name[i], media_aluno);
	}
}
