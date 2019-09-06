package chapter3.template;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferedReaderCallback {

	Integer doSomethingWithReader(BufferedReader br) throws IOException;
}


/*
 *  템플릿/ 콜백 패턴 적용
 *  1. 템플릿에 담을 반복되는 작업 흐름 ?
 *   --> 템플릿이 BufferedReader를 만들어서 콜백에게 전달 -> 콜백이 각 라인을 읽어서 처리 후 최종결과를 템플릿에게 돌려줌
 *    (br:파일을 열어서 각 라인을 읽어올 수 있는 )
 *    
 *   
 *  2. 템플릿이 콜백에게 전달해줄 내부의 정보?
 *   ->콜백 오브젝트를 호출하여 템플릿에서 만든 bufferedReader(context)를 전달
 *  
 *  3. 콜백이 템플릿에게 돌려줄 내용?
 *  
 *  
 *  4. 템플릿이 작업을 마친 뒤 클라이언트에게 전달해줘야 하는것?
 *  
 *  
 *  5. 템플릿과 콜백의 경계
 *  
 *  
 * 
 * 
 */