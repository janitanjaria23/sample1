import java.util.*;
class ascending2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0, b=0, c=0;
        System.out.print("Enter first no. : ");
        a=sc.nextInt();
        System.out.print("Enter second no. : ");
        b=sc.nextInt();
        System.out.print("Enter third no. : ");
        c=sc.nextInt();
        if(a>b && a>c && b>c)
        System.out.print("the nos. in ascending order are: "+c+b+a);
        else if(a>b && a>c && c>b)
             System.out.print("the nos. in ascending order are: "+b+c+a);
        else if(b>c && b>a && a>c)
             System.out.print("the nos. in ascending order are: "+c+","+a+b);
        else if(b>c && b>a && c>a)
             System.out.print("the nos. in ascending order are: "+a+c+b); 
        else if(c>a && c>b && a>b)
             System.out.print("the nos. in ascending order are: "+b+a+c);
        else if(c>a && c>b && b>a)
             System.out.print("the nos. in ascending order are: "+a+b+c);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             �U�;U�t�M��E% 3�����t�M�Q�	 ���ЋU؋E؋J+H����X   ���E��U؋B�E܋M�Q�\	 ���U��B    �E��@    �M��A    ��]���������U���   �M��E��H;Mr�U�B�E��M�;Ms�M��P �U��B+E;Es�M��Q+U�U�E�H�M�U�+U�U��E�;Es�M��M���+U�E��H+M;�w�M��; �U��B+E+E�E��M��QU+U�U�E��H;M�sj �U�R�M��t����E�;E��   �M��yr�U��B�E��	�M����M��U��zr�E��H�M��	�U����U��E�P�M�MMQ�U�UUR�	 ���E�xr�M�Q�U��	�E���E��M��yr�U��B�E��	�M����M��UR�E�EP�M�MQ��	 ���  �U;U��   �E��xr�M��Q�U��	�E����E��M��yr�U��B�E��	�M����M��UR�E�EP�M�MQ�X	 ���U��zr�E��H�M��	�U����U��E��xr�M��Q�U��	�E����E��M�Q�U�UUR�E�EEP��	 ����  �M;M��   �U��zr�E��H�M��	�U����U��E��xr�M��Q�U��	�E����E��M�Q�U�UUR�E�EEP�	 ���M��yr�U��B�E��	�M����M��U��zr�E��H�M��	�U����U��EP�M�MQ�U�UR�?	 ���  �EE;E��   �M��yr�U��B�E��	�M����M��U��zr�E��H�M��	�U����U��E�P�M�MMQ�U�UUR��	 ���E��xr�M��Q�U��	�E����E��M��yr�U��B��|�����M�����|����UR�EE+E�M��Q��|���UR�l	 ���A  �E��xr�M��Q��x�����E�����x����M��yr�U��B��t�����M�����t����UR��x���EP��t���MQ�	 ���U��zr�E��H��p�����U�����p����E��xr�M��Q��l�����E�����l����M�Q��p���UUR��l���EEP�	 ���M��yr�U��B��h�����M�����h����U��zr�E��H��d�����U�����d����E+EP��h���MMQ��d���UUR�&	 ���E��H;M�rj �U�R�M��
�������t>�E� �M��U�Q�E��xr�M��Q��`�����E�����`�����`���M�UÈ�E���]� ������������U��j�hW�$ d�    Pd�%    Q�E�    �EP�MQ�UR�   ���E����E��E�M�d�    ��]���U��j�hWu$ d�    Pd�%    Q�E�    �EP�MQ�UR��   ���E����E��E�M�d�    ��]���U��j�h'u$ d�    Pd�%    Q�E�    �EP�MQ�UR��   ���E����E��E�M�d�    ��]���U��j�h/�$ d�    Pd�%    Q�E�    �E� �T& �M�A �E�   �U�h8& �E�M�H�U�E�B�E� �M����M��E�M�d�    ��]�U��j�h�t$ d�    Pd�%    Q�E�    �E� �T& �M�A �E�   �U� 8& �E�M�H�U�E�B�E� �M����M��E�M�d�    ��]�U��j�h�t$ d�    Pd�%    Q�E�    �E� �T& �M�A �E�   �U�x8& �E�M�H�U�E�B�E� �M����M��E�M�d�    ��]�U��VW��E  �E�M��  �M�U+U���B�����@�ȅ�t�u�F   �}����E_^]���U��j�h�$ d�    Pd�%    Q��0SVW�e��E�E��E�    ��M���M�U��P�U�} v4�E�E��E��}� t�MQ�M��+  �E���E�    �U��U��E� ��;�	�E��P�E�M�;Mt�M��� 3҃���t�E�P�s� ����j j �.I	 �E������M�d�    _^[��]���������������U��j�hQ�$ d�    Pd�%    Q��4SVW�e��E�E��E�    ��M���M�U��X�U�} v4�E�E��E��}� t�MQ�M��{  �E���E�    �U��U��E� ��;�	�E��X�E�M�;M