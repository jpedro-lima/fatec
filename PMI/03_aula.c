/*
	João Pedro Correia de Lima
	RA: 1430482313040
	Data: 06/03/2023
*/

#include <stdio.h>

int	main(void)
{
	int nb[5] = {12, -1, 15, 42};
	int	biggest = -2147483648;
	int i = -1;
	while(nb[++i])
	{
		if (nb[i] > biggest)
			biggest = nb[i];
	}
	printf("the biggest nb is: %d\n", biggest);
	return (0);
}


int	main(void)
{
	int nb[5] = {12, -1, 15, 42};
	int	biggest = -2147483648;
	int smallest = 2147483647;
	int i = -1;
	while(nb[++i])
	{
		if (nb[i] > biggest)
			biggest = nb[i];
		if (nb[i] < smallest)
			smallest = nb[1];
	}
	printf("the biggest nb is: %d\n", biggest);
	printf("the smallest nb is: %d\n", smallest);
	return (0);
}

// int argument_checker(int nb)
// {
// 	int nb;

// 	return (nb);
// }

// int	main(int argc, char **argv)
// {
// 	int	*nb;
// 	int i = -1;
// 	int biggest = 0;

// 	if (argc <= 1)
// 		printf("Argument error\n");
// 	else
// 	{
// 		argv++;
// 		nb = argument_checker(argv);
// 		if (!nb)
// 		{
// 			printf("Argument error\n");
// 			return (0);
// 		}
// 		while(nb[++i])
// 		{
// 			if (nb[i] > biggest)
// 				biggest = nb[i];
// 		}
// 		printf("the biggest nb is: %d\n", biggest);
// 	}	
// 	return (0);
// }
