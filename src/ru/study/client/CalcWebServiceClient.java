package ru.study.client;


import ru.study.ws.CalcWebService;
import ru.study.ws.CalcWebServiceImplService;

public class CalcWebServiceClient {
    public static void main(String[] args) {
        CalcWebServiceImplService calcWebServiceImplService = new CalcWebServiceImplService();
        CalcWebService calcWebService = calcWebServiceImplService.getCalcWebServiceImplPort();
        System.out.println(calcWebService.getCalcAdd(12, 2));
        System.out.println(calcWebService.getCalcMultiply(40, 2));
        System.out.println(calcWebService.getCalcSubtract(40, 2));
        System.out.println(calcWebService.getCalcDivide(40, 2));
    }


}
