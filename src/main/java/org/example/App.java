package org.example;

import org.example.data.CalculatorImplement;
import org.example.data.CalculatorRepository;
import org.example.model.ScannerClassCalling;

import static org.example.model.ScannerClassCalling.enterNumber1;
import static org.example.model.ScannerClassCalling.enterNumber2;

/**
 * Calculator Interface Implementation
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Calculator Interface" );

        CalculatorRepository repository = new CalculatorImplement();

       float resultrepAdd =  repository.addNum(enterNumber1(),enterNumber2());

        System.out.println("Addition is "+resultrepAdd);

        float resultrepMul =  repository.mulNum(enterNumber1(),enterNumber2());

        System.out.println("Multiplication is "+resultrepMul);

        float resultrepSub =  repository.subNum(enterNumber1(),enterNumber2());

        System.out.println("Subtraction is "+resultrepSub);

        float resultrepDiv =  repository.divNum(enterNumber1(),enterNumber2());

        System.out.println("Division is "+resultrepDiv);
    }

    }

