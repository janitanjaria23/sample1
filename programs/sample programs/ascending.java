import java.util.*;
class ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double min=0,a=0,b=0,c=0,max=0,inter=0;
        System.out.print("enter number: ");
        a=sc.nextDouble();
        System.out.print("enter second number: ");
        b=sc.nextDouble();
        System.out.print("enter third number: ");
        c=sc.nextDouble();
        if(a==b&&b==c)
        	System.out.println("they are equal");
        if(a>b)
          {
            min=b;
            max=a;
          }
        else
          {
            min=a;
            max=b;
          }
        if(min>c)
           {
            inter=min;
            min=c;
           }
            
         else 
         	inter=c;
            
        System.out.println("1st no."+min);
        if(max>inter)
           {
             System.out.println("2nd no."+inter);
             System.out.println("3rd no."+max);
           }

         else
           {
            System.out.println("2nd no."+max);
            System.out.println("3rd no."+inter);
           }
        }
}




            

                                                                                                                                                                                                                                                                                                                                                                 U��}et�}Eu�EP�MQ�UR�EP�L������4�}fu�MQ�UR�EP� �������MQ�UR�EP�MQ������]��U��} t#�EP�~  ����P�MQ�UUR�`����]���U���,�E-l  �E�}F|	�}�   ~�����   �M�U��E�UԋE����u�}~	�Mԃ��MԋU��Fi�m  �E�����M�ʍT�k�U�U��E�k�<Ek�<E�E��a�  �M� �E�M��UԉU�E�E�M���M�U�U��} t�} �u%�=$�E t�E�P��  ����t�M�(�E�M��E���]���U��j�h(AEhXfCd�    Pd�%    ���SVW�e�=�SV uWj j jh$AEh   j ���D��t��SV   �/j j jh AEh   j ���D��t��SV   �3��k  �} ~�EP�MQ�w  ���E�=�SVu#�UR�EP�MQ�UR�EP�MQ���D�&  �=�SV�  �}  u	��SV�U j j �EP�MQ�U$��҃���R�E P���D�E�}� u3���  �E�    �E�����$��g���eЉe�MЉM��E�������   Ëe��E�    �E������}� u3��  �U�R�E�P�MQ�URj�E P���D��u3��`  j j �M�Q�U�R�EP�MQ���D�E؃}� u3��6  �U��   ��tC�} t8�E�;E~3��  �MQ�UR�E�P�M�Q�UR�EP���D��u3���   ��   �M؉M��E�   �E�����$��f���ẻe�ỦU��E�������   Ëe��E�    �E������}� u3��   �E�P�M�Q�U�R�E�P�MQ�UR���D��u3��k�} u.j j j j �E�P�M�Qh   �U R�x�D�E؃}� u3��9�0j j �EP�MQ�U�R�E�Ph   �M Q�x�D�E؃}� u3���E��3��e��M�d�    _^[��]������������U����E�E��M�M��U��E����E���t�M����t�E����E��ۋM����u�E�+E��E��]�U��Q�   �M��E�    �	�U����U��}�-s$�E��M;�`�Eu�f   �U���d�E��E�̓}r�}$w�E   �    �*�}�   r�}�   w�&   �    ��   �    ��]����������������U����   ��]����U���   ��]����U��Q觵�����D���E�=��E�u3��]jah@AEjjtj��@�����E��}� t�E�P���EQ�<�D��u3��&�U�R�/   ���8�D�M���U��B�����   ��]���������������U��E�@P��E�M�A   ]��������U����0�D�E����EP���D�E��}� uch�   h@AEjjtj�7@�����E��}� t8�M�Q���ER�<�D��t#�E�P�}������8�D�M���U��B�����
j�t�����E�P���D�E���]���������U��=��E���   �} u���EP���D�E�} ��   �M�y$ tj�U�B$P��E�����M�y( tj�U�B(P��E�����M�y0 tj�U�B0P�E�����M�y8 tj�U�B8P�E�����M�y@ tj�U�B@P�E�����M�yD tj�U�BDP�hE�����M�yP��Etj�U�BPP�KE����j�MQ�=E����j ���ER�<�D]����������U����E����E��E��HPQ�UR�  ���E��}� t	�E��x u�MQ���D�x  �U��zu�E��@    �   �[  �M��yu����J  �U��B�E��M��QT�U�E��M�HT�U��z��   �H�E�E��	�M���M�H�EL�E9U�}�E�k��M��QP�D    �ЋE��HX�M�U��:�  �u�E��@X�   �   �M��9�  �u�U��BX�   �q�E��8�  �u�M��AX�   �Z�U��:�  �u�E��@X�   �C�M��9�  �u�U��BX�   �,�E��8�  �u�M��AX�   ��U��:�  �u
�E��@X�   �M��QXRj�U����E��M�HX��U��B    �E��HQ�U����U��E�BT�����]���U��Q�E�E��M��;Ut�E����E��T�Ek��U�9U�s�ءT�Ek��M�9