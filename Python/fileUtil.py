#-*- coding:UTF-8 -*-

import os

symbol = '\t'

#递归遍历指定目录，返回目录下的所有文件名
def eachFile(filepath, flagCount = 0):
    pathDir = os.listdir(filepath)
    
    flag =""
    for i in range(flagCount):
        flag = flag + symbol
    
    strList = flag
    if flagCount == 0:
        strList = filepath + os.linesep
    else:
        strList = flag + filepath.split(os.path.sep)[-2] + os.linesep
    flag = flag + symbol
    
    for allDir in pathDir:
        child = os.path.join('%s%s' % (filepath, allDir))
        if os.path.isdir(child):
            strList = strList + eachFile(child + os.path.sep, flagCount + 1)
        else:
            strList = strList + flag + allDir + os.linesep
    return strList
        
if __name__=='__main__':
    filepath='F:' + os.path.sep + 'software' + os.path.sep
    print(eachFile(filepath))

