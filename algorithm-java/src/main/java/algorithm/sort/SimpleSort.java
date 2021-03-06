package algorithm.sort;

import java.util.Random;
import static algorithm.util.UtilTools.exchange;
import static algorithm.util.UtilTools.print;

/**
 * 这些排序算法不需要额外的空间（除开交换时，交换时也可以改成不需要额外空间）
 */
public class SimpleSort {

	/**
	 * 《算法》P156 选择排序
	 * @param source
	 */
	public static void selectionSort(int[] source){
		int len = source.length;
		int count = 0;
		for(int i=0;i<len;i++){
			int min = i;
			for(int j=i+1;j<len;j++){//执行次数为(n-1)+...+2+1 每次选出右边最小的数放到左边
				if(source[j]<source[min]){
					min = j;
				}
			}
			if(i!=min){
				count++;
				exchange(source,i,min);
				//print(source);
			}
		}
		System.out.println(count);
	}
	
	/**
	 * 《算法》P157 插入排序
	 * @param source
	 */
	public static void insertionSort(int[] source){
		int len = source.length;
		int count = 0;
		for(int i=1;i<len;i++){//每次处理完左边都是有序列
			for(int j=i;j>0 && source[j]<source[j-1];j--){//将右端的数向左做对比,冒泡
				count++;
				exchange(source,j,j-1);
				//print(source);
			}
		}
		System.out.println(count);
	}
	
	/**
	 * 《算法》P163希尔排序
	 * @param source
	 */
	public static void shellSort(int[] source){
		int len = source.length;
		int h = 1;
		while(h<len/3){
			h=3*h + 1;
		}
		int count = 0;
		while(h>=1){//相对于插入排序，希尔排序初始的步进>1，逐步增加左边数列列的有序性，对应最终步进为1时的比较总量小于插入排序
			for(int i = h;i<len;i++){//向右推进
				for(int j=i;j>=h && source[j] < source[j-h];j-=h){//按步进向左比较
					count++;
					//print(source);
					exchange(source,j,j-h);
				}
			}
			h = h/3;//收索比较的步进
		}
		System.out.println(count);
	}
	
	
	
	
	public static void main(String[] args) {
		int[] source = new int[10000];
		Random r = new Random();
		for(int i=0;i<source.length;i++){
			source[i] = r.nextInt(300);
		}
		print(source);
		Long begin = System.currentTimeMillis();
		//selectionSort(source);
		//insertionSort(source);
		shellSort(source);
		System.out.println(System.currentTimeMillis()-begin+"ms");
		print(source);
	}
}
