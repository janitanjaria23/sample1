import java.util.*;

class pyramid2{
    public static void main(String args[])
    {
        int r= 0,sp,e=1,d=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter r:");
            r=sc.nextInt();
            }while(r<6 || r>24);
         sp=r-1;
         for(int i=1;i<r;++i)
         {
          for(int j=1;j<sp+1;++j)
            System.out.print(" ");
            System.out.print("*");
            for(int j=1;j<d;++j)
            System.out.print(" ");
            if(e>1)
            System.out.print("*");
            ++e;
            sp--;
            d++;
            d++;
            System.out.println(" ");
            }
            
            for(int t=1;t<r+1;++t)
            System.out.print("* ");
            
            }}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        �Y                                                                                                                                                                                                                                                                                                                                                                                                        rev"
bind "MOUSE1" "+attack"
bind "MOUSE2" "+attack2"
bind "PAUSE" "pause"
_cl_autowepswitch "1"
_snd_mixahead "0.1"
ati_npatch "1.0"
ati_subdiv "2.0"
bgmvolume "1.000000"
bottomcolor "6"
brightness "1"
cl_allowdownload "1"
cl_allowupload "1"
cl_backspeed "400"
cl_career_difficulty "0"
cl_cmdbackup "2"
cl_cmdrate "30"
cl_corpsestay "600.000000"
cl_crosshair_color "50 250 50"
cl_crosshair_size "auto"
cl_crosshair_translucent "1"
cl_dlmax "128"
cl_download_ingame "1"
cl_dynamiccrosshair "0"
cl_forwardspeed "400"
cl_himodels "0"
cl_idealpitchscale "0.8"
cl_lc "1"
cl_logocolor "#Valve_Blue"
cl_logofile "8ball1"
cl_lw "1"
cl_minmodels "0"
cl_radartype "0"
cl_righthand "1"
cl_shadows "1"
cl_timeout "35"
cl_updaterate "30"
cl_vsmoothing "0.05"
cl_weather "1"
con_color "255 180 30"
console "1"
crosshair "1.000000"
fastsprites "0"
fps_max "101"
fps_modem "0"
gamma "3"
gl_dither "1"
gl_flipmatrix "0"
gl_monolights "0"
gl_overbright "0"
gl_polyoffset "0.1"
hisound "1"
hpk_maxsize "4"
hud_capturemouse "1"
hud_centerid "1"
hud_draw "1"
hud_fastswitch "0"
hud_saytext_internal "1"
hud_takesshots "0"
joystick "0"
lookspring "0.000000"
lookstrafe "0.000000"
m_filter "0"
m_forward "1"
m_pitch "0.022"
m_side "0.8"
m_yaw "0.022"
model "arctic"
MP3FadeTime "2.0"
MP3Volume "0.800000"
mp_decals "300.000000"
name "Ravi"
net_graph "0"
net_graphpos "1"
net_scale "5"
r_bmodelhighfrac "5.0"
r_detailtextures "0"
s_a3d "0.0"
s_automax_distance "30"
s_automin_distance "2"
s_bloat "2.0"
s_distance "60"
s_doppler "0.0"
s_eax "0.0"
s_leafnum "0"
s_max_distance "1000"
s_min_distance "5"
s_numpolys "200"
s_polykeep "1000000000"
s_polysize "10000000"
s_refdelay "4"
s_refgain "0.4"
s_rolloff "1.0"
s_verbwet "0.25"
sensitivity "3"
skin ""
spec_autodirector_internal "1"
spec_drawcone_internal "1"
spec_drawnames_internal "1"
spec_drawstatus_internal "1"
spec_mode_internal "2"
spec_pip "0"
suitvolume "0.250000"
sv_aim "0"
sv_voiceenable "1"
team ""
t