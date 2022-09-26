from keras.preprocessing.image import load_img, img_to_array
from keras.applications.vgg16 import decode_predictions,preprocess_input
from keras.applications import VGG16
import sys
vgg = VGG16(weights='imagenet',input_shape=(224,224,3))
def convert(picture):
    ChosenPhoto = load_img(picture,target_size=(224,224))
    ChosenPhoto = img_to_array(ChosenPhoto)
    ChosenPhoto = ChosenPhoto.reshape(1,ChosenPhoto.shape[0],ChosenPhoto.shape[1],ChosenPhoto.shape[2])
    ChosenPhoto = preprocess_input(ChosenPhoto)
    prediction = vgg.predict(ChosenPhoto)
    Classification = decode_predictions(prediction,top=3)
    Classification = Classification[0]
    for eachclass in Classification:
    	print("Label:",eachclass[1],"Precentage",eachclass[2] * 100)
    return 1

import os

def predict(path):
    images =[]
    outputarray = []
    for directoryname, directorynames, imagefilenames in os.walk(path):
      for imagefilename in imagefilenames:
         CurrentFile = os.path.join(directoryname,imagefilename)
         print(CurrentFile)
         CurrentImage = convert(CurrentFile)
         prediction = vgg.predict(CurrentImage)
         Classification = decode_predictions(prediction,top=3)
         Classification = Classification[0]
         for eachclass in Classification:
           print("Label:",eachclass[1],"Precentage",eachclass[2] * 100)

convert(sys.argv[1])
