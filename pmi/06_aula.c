/*
	João Pedro Correia de Lima
	RA: 1430482313040
	Data: 10/04/2023
*/

#include <stdio.h>
#include <stdlib.h>

int	main(void)
{
	float	media_geral;
	float	media_aluno;
	char	name[50][150];
	float	score[50][4];

	media_geral = 0;
	for (int i = 0; i < 50; i++)
	{
		printf("Informe o nome do aluno: ");
		scanf("%s", name[i]);
		for (int j = 0; j < 4; j++)
		{
			printf("Informe a nota da P%d: ", j + 1);
			scanf("%f", &score[i][j]);
			media_geral += score[i][j];
		}
	}
	media_geral /= (50 * 4);
	printf("Média geral: %.2f\n", media_geral);
	for (int i = 0; i < 50; i++)
	{
		media_aluno = (score[i][0] + score[i][1] + score[i][2] + score[i][3]) / 4;
		if (media_aluno > media_geral)
			printf("🌟 %s média: %.2f \n", name[i], media_aluno);
		else
			printf("%s média: %.2f \n", name[i], media_aluno);
	}
}
