# Senekedule:

## Basic Structure:
![enter image description here](https://lh3.googleusercontent.com/kWVs_UvwD5tV83JuHzotAZ7qthbeEsCWkr6bvmGI0GNLx0sK66RmXBBHn89afcULz0fJm0oA3kaNJui9q7G6t66-C6-iL8RtsIC9I4a8ftWb4WuTYAQQzkNL7qzpDysT5sApk59_uNEnZD6hriw_4iwh4QQZRSSeB-C8g1t5klDfPbd4ZQwBbFKVN_kcAF5BXDbE29nroc-_v7t6aJBukndCqhwSFosJqmoYZnGqLZ3TzYzaGClaptkT2XTAsacIKUMVOsSh3TfRy8Jv6qcryDQ9eQmle7jC49TsXkNN8T9VMfSsiqKrLZrS8F4Kvm43dgZuPse4rtOJgiporL6mmzvU3lG7gj_MUMvlwPvrRAI08zg_j9zcVSHJ40lbCLcBADOTNn-_UQo-Hs08gsnzUaHizK6LbuPBFiyIRSEXPBmWgN07jR9KUxKIVES-xaXDalFVzyCuNW-uF7J9TcnRvZmdNx4UAQ4eYzQiz3JWsxZQyTvSKd_O2RPk6Fbw49Ok2X_Qylf1suQ5cXDM1PvWl0FssmSzKs4yhn5tPvPom4J4koayrA_fH_bzsEM__z9L7ZOSM6IHr1xkHiOAD_O9tA8KnoJSfI2-PfjZtPFJAXLRpfaOHN9jHF6TD-mQQJJVgxv0q-6PokLpbO69SFejTGd91Iu0n12x-H_NqNvhcbBhMvuGoh0tra8PbX9RP9BDBIAwAktz9tX-sdfcXZJVLSld2pgqe0Y6WW5rwyMDBWht0wrnxw=w372-h634-no)

## Objective:
We have N pools of objects that have the same 'Code', the user must enter a list of 'Codes' and the system must response with a list of courses one of each pool choosed by the user, without schedules crashig.

## Approaching:

 - Brute Force
 - Multi-backpack
## Basic Information flow
![enter image description here](https://lh3.googleusercontent.com/IMwTs14x-Lziy0GOFaZg9ISkcsql0b4nuLbZn1NZ2YHKdX9P6gMfu8ANvPc5nyb_xsrXpknc_x5mzm94yK8R6_sMaGft_pvd0o_jac4HhsVbN3CYSMF-6-t-iKvL6H5j_e9iJyQ4jiQFuj_hLw4-beMztyO67baKECX6EWDL_68teMqNsC9AmSQSqwhWPI2qzqx1XjBiQwZuWgf417f5aFJl-G1f-7vY3AkkfTnXzwhlzM9YbHp9bOQQNkebZcfGheZjOuwQePWQgurW6FkDE5vwEvMWSkd-WIhU9gNt10sS15zOpUeG43GR3Jiok86f7guDSl2_Z1BkXOLgEplkHoTEm6k3r1wOevgaHDpfAcdTHEAMUmzSsAX_rZhwnyqnnlQ58-_cguzovXdTuPPPVlmvIQo3mnOtI3nTTSmcwRs3VUvDIuBL2Wm4yMexDQ-gSz92g84Jcuir22liSRxIH7IgYLeNRfCq7ryzeUHUrUvq9_EL--HaGM4A-GK2mQG-lATGfwN-f0v-6njlCIYoEjV1s-Bdz6Ujx5y_JnqlZ_XVitBKABbiQtwJxYqftChSIkFTeoPQo8Ls-3uIDDGPgyTnljcMSK0U_VjP1TLWUlEgp9FDub5VNY78s8-Deq5_8wv19_MWqdsdR9YSg9sOfoyTFeVSFw0XMKMn0X0Yx7zH7f401NDnMbJo=w1325-h525-no)
##  Example Course Json Structure

```json
{  
  "nrc": "####",  
  "code": "XXXX####",  
  "title": "XXXXXXXXXXXXXXXXXXXXXXXX",  
  "maxStudents": "##",  
  "currentStudents": "##",  
  "teachers": [  
    {  
      "name": "XXXXXXXXXXXXX",  
	  "ind": "XXXX"  
  },  
  {  
      "name": "XXXXXXXXXXXXX",  
  "ind": null  
  }  
  ],  
  "schedules": [  
    {  
      "time_ini": "1100",  
	  "time_fin": "1220",  
	  "classroom": "- -",  
	  "l": "L",  
	  "m": null,  
	  "i": "I",  
	  "j": null,  
	  "v": null,  
	  "s": null,  
	  "d": null,  
	  "date_ini": "2020-01-20 00:00:00",  
	  "date_fin": "2020-05-23 00:00:00",  
	  "building": "- -",  
	  "patron": "1"  
	  },  
	  {  
      "time_ini": "1100",  
	  "time_fin": "1220",  
	  "classroom": "- -",  
	  "l": null,  
	  "m": null,  
	  "i": null,  
	  "j": "J",  
	  "v": null,  
	  "s": null,  
	  "d": null,  
	  "date_ini": "2020-01-20 00:00:00",  
	  "date_fin": "2020-05-23 00:00:00",  
	  "building": "- -",  
	  "patron": "4"  
	  }  
  ]  
}```
