#include "com_example_helloworld_HelloWorld.h"

JNIEXPORT jstring JNICALL Java_com_example_helloworld_HelloWorld_messageFromNativeCode

(JNIEnv * env, jobject jObj)
{

	return (*env)->NewStringUTF(env, "Hello World from native code!");

}
