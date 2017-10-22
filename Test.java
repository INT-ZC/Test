import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Test
{
	public static void allPermutation(String str){
		LinkedList<String> listStr = new LinkedList<String>();
		allPermutation(str.toCharArray(), listStr, 0);
		print(listStr);//打印全排列
	}
	
	
	private static void allPermutation(char[] c, LinkedList<String> listStr, int start){
		
		
		if(start == c.length-1)
			listStr.add(String.valueOf(c));
		else{
			for(int i = start; i <= c.length-1; i++)
			{
				swap(c, i, start);//相当于: 固定第 i 个字符
				allPermutation(c, listStr, start+1);//求出这种情形下的所有排列
				swap(c, start, i);//复位
			}
		}
	}
	
	private static void swap(char[] c, int i, int j){
		char tmp;
		tmp = c[i];
		c[i] = c[j];
		c[j] = tmp;
	}
	
	private static void print(LinkedList<String> listStr)
	{
		Collections.sort(listStr);//使字符串按照'字典顺序'输出
		for (String str : listStr) {
			System.out.println(str);
		}
	}
	
	//hapjin test
	public static void main(String[] args) {
		allPermutation("0123457");
	}
}

/*
public static int total = 0;
	
	public static void swap(String[] str, int i, int j)
	{
		String temp;
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	
	public static void arrange(String[] str, int st, int len)
	{
		if (st == len - 1)
		{
			for (int i = 0; i < len; i++)
			{
				System.out.print(str[i] + "");
			}
			System.out.println();

		}
		else
		{
			for (int i = st; i < len; i++)
			{
				swap(str, st, i);
				arrange(str, st + 1, len);
				swap(str, st, i);
			}
		}
		
	}
	

public static void main(String[] args)
{
	// TODO Auto-generated method stub
	String str[] = {"0","1","2","3","4","5","7"};
	arrange(str, 0, str.length);
}

public class KNN {
	
	static int[][] DATA =
			{
					{0, 4686, 1891, 3262, 2964, 1096, 5576, 3512}, //B
					{4686, 0, 3623, 5585, 2700, 5773, 8960, 1203}, //C
					{1891, 3623, 0, 2360, 1174, 2796, 5650, 2473}, //D
					{3262, 5585, 2360, 0, 2906, 3393, 3416, 4624}, //J
					{2964, 2700, 1174, 2906, 0, 3945, 6320, 1741}, //M
					{1096, 5773, 2796, 3393, 3945, 0, 4862, 4607}, //O
					{5576, 8960, 5650, 3416, 6320, 4862, 0, 8037}, //S*
					{3512, 1203, 2473, 4624, 1741, 4607, 8037, 0}  //T
			};
	
	static int x, y;
	
	public static void main(String[] args)
	{
		listAll(Arrays.asList(0,1,2,3,4,5,7), "");
	}
	
	public static void listAll(List candidate, String prefix)
	{
		if(prefix.length()==7){
			System.out.println(prefix);
		}
		for(int i=0;i<candidate.size();i++) {
			List tmp = new LinkedList(candidate);
			listAll(tmp, prefix + tmp.remove(i));//函数中的参数从右边开始解析
		}
	}

	//计算临近距离[除开求解分类]
	public double distince(double []paraFirstData,double []paraSecondData){
		double tempDistince = 0;
		if((paraFirstData!=null && paraSecondData!=null) && paraFirstData.length==paraSecondData.length){
			for(int i=0;i<paraFirstData.length-1;i++){
				tempDistince += Math.abs(paraFirstData[i] - paraSecondData[i]);
			}
		}else{
			System.out.println("firstData 与 secondData 数据结构不一致");
		}
		return tempDistince;
	}
	
	//对临近距离排序,从小到大[这里采用冒泡排序]
	public double[] sortDistinceArray(double []paraDistinceArray){
		if(paraDistinceArray!=null && paraDistinceArray.length>0){
			for(int i=0;i<paraDistinceArray.length;i++){
				for(int j=i+1;j<paraDistinceArray.length;j++){
					if(paraDistinceArray[i]>paraDistinceArray[j]){
						double temp = paraDistinceArray[i];
						paraDistinceArray[i] = paraDistinceArray[j];
						paraDistinceArray[j] = temp;
					}
				}
			}
		}
		return paraDistinceArray;
	}
}
 */