

# Flat Toast
    Customized toast 

## Prerequisites

    Add this in your root build.gradle
    
```   
    allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
        }
    }
```
## Dependency
    Add this to your module's build.gradle file (make sure the version matches the JitPack badge above):
    
```    
    dependencies {
	...
	implementation 'com.github.moha97ibrahim:CustomToast:v1.0
    }
```    
    
## Usage 
### Parameters 
    FlatToast.TOAST_TYPE(Context,Message,Duration,WithIcon,Toast_Position);
    Duration 
            0 -> Length Short 
            1 -> Length Long
    WithIcon
            true  -> show with icon
            false -> show without icon
    Toast Position
            Gravity.TOP     -> Show in top
            Gravity.CENTER  -> Show in center
            Gravity.BOTTOM  -> Show in Bottom

### To display Success toast
    FlatToast.success(getApplicationContext(),"Success",1,true,Gravity.BOTTOM);
    
### To display Error toast
    FlatToast.error(getApplicationContext(),"Failed",1,false,Gravity.TOP);

### To display Info toast
    FlatToast.info(getApplicationContext(),"Information",0,true,Gravity.CENTER);

### To display Warning toast
    FlatToast.warning(getApplicationContext(),"warning",1,true,Gravity.BOTTOM);
    
##  Custom Toast
### Parameters 
    FlatToast.TOAST_TYPE(Context,Message,Duration,WithIcon,Toast_Position,Icon_ResourcesID);
    Duration 
            0 -> Length Short 
            1 -> Length Long
    WithIcon
            true  -> show with icon
            false -> show without icon
    Toast Position
            Gravity.TOP     -> Show in top
            Gravity.CENTER  -> Show in center
            Gravity.BOTTOM  -> Show in Bottom
    
### To display custom toast
    FlatToast.custom(getApplicationContext(),"Unable to load",0,true,0,R.drawable.ic_action_success);   
    
    
