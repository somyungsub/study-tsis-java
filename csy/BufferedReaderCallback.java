package chapter3.template;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferedReaderCallback {

	Integer doSomethingWithReader(BufferedReader br) throws IOException;
}


/*
 *  ���ø�/ �ݹ� ���� ����
 *  1. ���ø��� ���� �ݺ��Ǵ� �۾� �帧 ?
 *   --> ���ø��� BufferedReader�� ���� �ݹ鿡�� ���� -> �ݹ��� �� ������ �о ó�� �� ��������� ���ø����� ������
 *    (br:������ ��� �� ������ �о�� �� �ִ� )
 *    
 *   
 *  2. ���ø��� �ݹ鿡�� �������� ������ ����?
 *   ->�ݹ� ������Ʈ�� ȣ���Ͽ� ���ø����� ���� bufferedReader(context)�� ����
 *  
 *  3. �ݹ��� ���ø����� ������ ����?
 *  
 *  
 *  4. ���ø��� �۾��� ��ģ �� Ŭ���̾�Ʈ���� ��������� �ϴ°�?
 *  
 *  
 *  5. ���ø��� �ݹ��� ���
 *  
 *  
 * 
 * 
 */